package me.zhengjie.modules.hr.rest;

import me.zhengjie.modules.hr.service.HrSalaryManagementService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工资发放管理表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:40
 */
@RestController
@RequestMapping("salary_management")
public class HrSalaryManagementController {

	@Resource
	private HrSalaryManagementService hrSalaryManagementService;
	

	
}
