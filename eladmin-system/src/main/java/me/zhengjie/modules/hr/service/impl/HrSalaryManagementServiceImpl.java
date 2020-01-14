package me.zhengjie.modules.hr.service.impl;

import me.zhengjie.modules.hr.mapper.HrSalaryManagementMapper;
import me.zhengjie.modules.hr.service.HrSalaryManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("hrSalaryManagementService")
public class HrSalaryManagementServiceImpl implements HrSalaryManagementService {

	@Resource
	private HrSalaryManagementMapper hrSalaryManagementMapper;

}
