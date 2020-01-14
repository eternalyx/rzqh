package me.zhengjie.modules.hr.service.impl;

import me.zhengjie.modules.hr.mapper.HrAttendanceMapper;
import me.zhengjie.modules.hr.service.HrAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service("hrAttendanceService")
public class HrAttendanceServiceImpl implements HrAttendanceService {

    @Autowired
	private HrAttendanceMapper hrAttendanceMapper;

}
