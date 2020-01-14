package me.zhengjie.modules.hr.rest;

import me.zhengjie.modules.hr.service.HrSalaryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工资表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:44
 */
@RestController
@RequestMapping("salary")
public class HrSalaryController {

	@Resource
	private HrSalaryService hrSalaryService;

	
}
