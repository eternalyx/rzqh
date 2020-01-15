package me.zhengjie.modules.hr.service.impl;

import java.util.List;
import java.util.Map;
import me.zhengjie.modules.hr.domain.HrEmployeeEntity;
import me.zhengjie.modules.hr.mapper.HrEmployeeMapper;
import me.zhengjie.modules.hr.service.HrEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrEmployeeServiceImpl implements HrEmployeeService {
    @Autowired
    private HrEmployeeMapper hrEmployeeDao;

    @Override
    public HrEmployeeEntity queryObject(String id) {
        return hrEmployeeDao.queryObject(id);
    }

    @Override
    public List<HrEmployeeEntity> queryList(Map<String, Object> map) {
        return hrEmployeeDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return hrEmployeeDao.queryTotal(map);
    }

    @Override
    public void save(HrEmployeeEntity hrEmployee) {
        hrEmployeeDao.save(hrEmployee);
    }

    @Override
    public void update(HrEmployeeEntity hrEmployee) {
        hrEmployeeDao.update(hrEmployee);
    }

    @Override
    public void delete(String id) {
        hrEmployeeDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids) {
        hrEmployeeDao.deleteBatch(ids);
    }

}
