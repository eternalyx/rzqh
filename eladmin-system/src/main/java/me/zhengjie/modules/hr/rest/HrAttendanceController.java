package me.zhengjie.modules.hr.rest;

import me.zhengjie.modules.hr.service.HrAttendanceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 出勤表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:46
 */
@RestController
@RequestMapping("attendance")
public class HrAttendanceController {

	@Resource
	private HrAttendanceService hrAttendanceService;
	

	
}
