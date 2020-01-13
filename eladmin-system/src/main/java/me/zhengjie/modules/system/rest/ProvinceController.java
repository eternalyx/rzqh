package me.zhengjie.modules.system.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.zhengjie.aop.log.Log;
import me.zhengjie.modules.system.domain.Province;
import me.zhengjie.modules.system.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author zhoudanwei
 * @date 2020-01-10
 */
@RestController
@Api(tags = "系统：省市县乡联动")
@RequestMapping("/api/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @Log("获取所有省份")
    @ApiOperation("获取所有省份")
    @GetMapping(value = "/findAllProvince")
    public ResponseEntity<List<Province>> findAllProvince() throws IOException {
        return new ResponseEntity<>(provinceService.findAllProvince(), HttpStatus.OK);
    }

    @Log("查询某省下的市")
    @ApiOperation("查询某省下的市")
    @GetMapping(value = "/findCityByProvince")
    public ResponseEntity<List<Province>> findCityByProvince(@RequestParam("pid") String pid) {
        return new ResponseEntity<>(provinceService.findCityByProvince(pid), HttpStatus.OK);
    }

    @Log("查询某市下的区县")
    @ApiOperation("查询某市下的区县")
    @GetMapping(value = "/findAreaByCity")
    public ResponseEntity<Object> findAreaByCity(@RequestParam("pid") String pid, @RequestParam("cid") String cid) {
        return new ResponseEntity<>(provinceService.findAreaByCity(pid, cid), HttpStatus.OK);
    }

    @Log("查询某区县下的集镇")
    @ApiOperation("查询某区县下的集镇")
    @GetMapping(value = "/findTownByArea")
    public ResponseEntity<Object> findTownByArea(@RequestParam("pid") String pid, @RequestParam("cid") String cid, @RequestParam("aid") String aid) {
        return new ResponseEntity<>(provinceService.findTownByArea(pid, cid, aid), HttpStatus.OK);
    }
}