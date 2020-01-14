package me.zhengjie.modules.hr.rest;

import com.alibaba.fastjson.JSONObject;
import java.util.List;
import java.util.Map;
import me.zhengjie.modules.hr.domain.HrEmployeeEntity;
import me.zhengjie.modules.hr.service.HrEmployeeService;
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
 * 员工表
 *
 * @author zhoudanwei
 * @date 2020-01-14 18:36:13
 */
@RestController
@RequestMapping("/api/employee")
public class HrEmployeeController {
    @Autowired
    private HrEmployeeService hrEmployeeService;

    /**
     * 列表
     */
    @GetMapping
    public ResponseEntity<Object> list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        List<HrEmployeeEntity> hrEmployeeList = hrEmployeeService.queryList(params);
        long total = hrEmployeeService.queryTotal(params);
        return ResponseEntity.ok(PageUtil.toPage(hrEmployeeList, total));
    }


    /**
     * 信息
     */
    @GetMapping("/{id}")
    public ResponseEntity<Object> info(@PathVariable("id") String id) {
        JSONObject jsonObject = new JSONObject();
        HrEmployeeEntity hrEmployee = hrEmployeeService.queryObject(id);
        jsonObject.put("hrEmployee", hrEmployee);
        return ResponseEntity.ok(jsonObject);
    }

    /**
     * 保存
     */
    @PostMapping
    public ResponseEntity save(@RequestBody HrEmployeeEntity hrEmployee) {
        if (hrEmployee == null) {
            return ResponseEntity.ok("员工档案资料不能为空!");
        }
        hrEmployeeService.save(hrEmployee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * 修改
     */
    @PutMapping
    public ResponseEntity update(@RequestBody HrEmployeeEntity hrEmployee) {
        hrEmployeeService.update(hrEmployee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * 删除
     */
    @DeleteMapping
    public ResponseEntity delete(@RequestBody String[] ids) {
        hrEmployeeService.deleteBatch(ids);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
