package me.zhengjie.modules.hr.service.impl;

import java.util.List;
import java.util.Map;
import me.zhengjie.modules.hr.domain.HrWorkExperienceEntity;
import me.zhengjie.modules.hr.mapper.HrWorkExperienceMapper;
import me.zhengjie.modules.hr.service.HrWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HrWorkExperienceServiceImpl implements HrWorkExperienceService {
    @Autowired
    private HrWorkExperienceMapper hrWorkExperienceDao;

    @Override
    public HrWorkExperienceEntity queryObject(String id) {
        return hrWorkExperienceDao.queryObject(id);
    }

    @Override
    public List<HrWorkExperienceEntity> queryList(Map<String, Object> map) {
        return hrWorkExperienceDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return hrWorkExperienceDao.queryTotal(map);
    }

    @Override
    public void save(HrWorkExperienceEntity hrWorkExperience) {
        hrWorkExperienceDao.save(hrWorkExperience);
    }

    @Override
    public void update(HrWorkExperienceEntity hrWorkExperience) {
        hrWorkExperienceDao.update(hrWorkExperience);
    }

    @Override
    public void delete(String id) {
        hrWorkExperienceDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids) {
        hrWorkExperienceDao.deleteBatch(ids);
    }

}
