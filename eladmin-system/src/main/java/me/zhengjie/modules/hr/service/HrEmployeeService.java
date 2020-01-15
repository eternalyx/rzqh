package me.zhengjie.modules.hr.service;

import java.util.List;
import java.util.Map;
import me.zhengjie.modules.hr.domain.HrEmployeeEntity;

/**
 * 员工表
 *
 * @author zhoudanwei
 * @date 2020-01-14 18:36:13
 */
public interface HrEmployeeService {

    HrEmployeeEntity queryObject(String id);

    List<HrEmployeeEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(HrEmployeeEntity hrEmployee);

    void update(HrEmployeeEntity hrEmployee);

    void delete(String id);

    void deleteBatch(String[] ids);
}
