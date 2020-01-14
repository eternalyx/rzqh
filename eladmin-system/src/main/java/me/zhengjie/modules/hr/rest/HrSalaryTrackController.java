package me.zhengjie.modules.hr.rest;

import me.zhengjie.modules.hr.service.HrSalaryTrackService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工资轨迹表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:33
 */
@RestController
@RequestMapping("salary_track")
public class HrSalaryTrackController {

	@Resource
	private HrSalaryTrackService hrSalaryTrackService;
	

	
}
