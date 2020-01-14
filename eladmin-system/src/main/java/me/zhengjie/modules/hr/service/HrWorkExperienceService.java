package me.zhengjie.modules.hr.service;


import java.util.List;
import java.util.Map;
import me.zhengjie.modules.hr.domain.HrWorkExperienceEntity;

/**
 * 工作经验表
 *
 * @author zhoudanwei
 * @date 2020-01-14 18:36:13
 */
public interface HrWorkExperienceService {

    HrWorkExperienceEntity queryObject(String id);

    List<HrWorkExperienceEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(HrWorkExperienceEntity hrWorkExperience);

    void update(HrWorkExperienceEntity hrWorkExperience);

    void delete(String id);

    void deleteBatch(String[] ids);
}
