package me.zhengjie.modules.hr.rest;

import me.zhengjie.modules.hr.service.HrSocialSecurityDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 社保缴费明细表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:31
 */
@RestController
@RequestMapping("social_security_detail")
public class HrSocialSecurityDetailController {

	@Resource
	private HrSocialSecurityDetailService hrSocialSecurityDetailService;

	
}
