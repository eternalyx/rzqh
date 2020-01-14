package me.zhengjie.modules.hr.service.impl;

import me.zhengjie.modules.hr.mapper.HrSocialSecurityDetailMapper;
import me.zhengjie.modules.hr.service.HrSocialSecurityDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("hrSocialSecurityDetailService")
public class HrSocialSecurityDetailServiceImpl implements HrSocialSecurityDetailService {

	@Resource
	private HrSocialSecurityDetailMapper hrSocialSecurityDetailMapper;



}
