package me.zhengjie.modules.hr.service.impl;

import me.zhengjie.modules.hr.mapper.HrSalaryTrackMapper;
import me.zhengjie.modules.hr.service.HrSalaryTrackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("hrSalaryTrackService")
public class HrSalaryTrackServiceImpl implements HrSalaryTrackService {

    @Resource
	private HrSalaryTrackMapper hrSalaryTrackMapper;

}
