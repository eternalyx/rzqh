package me.zhengjie.modules.hr.service.impl;

import me.zhengjie.modules.hr.mapper.HrSalaryMapper;
import me.zhengjie.modules.hr.service.HrSalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("hrSalaryService")
public class HrSalaryServiceImpl implements HrSalaryService {

	@Resource
	private HrSalaryMapper hrSalaryMapper;


}
