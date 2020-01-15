package me.zhengjie.modules.hr.rest;

import com.alibaba.fastjson.JSONObject;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.zhengjie.modules.hr.domain.HrWorkExperienceEntity;
import me.zhengjie.modules.hr.service.HrWorkExperienceService;
import me.zhengjie.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 工作经验表
 *
 * @author zhoudanwei
 * @date 2020-01-14 18:36:13
 */
@RestController
@RequestMapping("/api/workexperience/")
public class HrWorkExperienceController {
    @Autowired
    private HrWorkExperienceService hrWorkExperienceService;

    /**
     * 列表
     */
    @GetMapping
    public ResponseEntity<Object> getAllExperience(@RequestParam Map<String, Object> params) {
        //查询列表数据
        List<HrWorkExperienceEntity> hrWorkExperienceList = hrWorkExperienceService.queryList(params);
        long total = hrWorkExperienceService.queryTotal(params);
        return ResponseEntity.ok(PageUtil.toPage(hrWorkExperienceList, total));
    }


    /**
     * 信息
     */
    @RequestMapping("/{id}")
    public ResponseEntity<Object> info(@PathVariable("id") String id) {
        HrWorkExperienceEntity hrWorkExperience = hrWorkExperienceService.queryObject(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hrWorkExperience", hrWorkExperience);
        return ResponseEntity.ok(jsonObject);
    }

    /**
     * 保存
     */
    @PostMapping
    public ResponseEntity save(@RequestBody HrWorkExperienceEntity hrWorkExperience) {
        hrWorkExperience.setCreateTime(new Date());
        hrWorkExperience.setUpdateTime(new Date());
        hrWorkExperience.setId(UUID.randomUUID().toString().replace("-", ""));
        hrWorkExperienceService.save(hrWorkExperience);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * 修改
     */
    @PutMapping
    public ResponseEntity update(@RequestBody HrWorkExperienceEntity hrWorkExperience) {
        hrWorkExperienceService.update(hrWorkExperience);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * 删除
     */
    @DeleteMapping
    public ResponseEntity delete(@RequestBody String[] ids) {
        hrWorkExperienceService.deleteBatch(ids);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}