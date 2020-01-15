package me.zhengjie.modules.system.service.impl;

import me.zhengjie.modules.system.domain.DeptLeader;
import me.zhengjie.modules.system.repository.DeptLeaderRepository;
import me.zhengjie.modules.system.service.DeptLeaderService;
import me.zhengjie.modules.system.service.dto.DeptLeaderDto;
import me.zhengjie.modules.system.service.dto.DeptLeaderQueryCriteria;
import me.zhengjie.modules.system.service.mapper.DeptLeaderMapper;
import me.zhengjie.utils.QueryHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
* @author Liucw
* @date 2020-1-16
*/
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DeptLeaderServiceImpl implements DeptLeaderService {

    @Autowired
    private DeptLeaderRepository deptLeaderRepository;
    @Autowired
    private DeptLeaderMapper deptLeaderMapper;

    @Override
    public List<DeptLeaderDto> queryAll(DeptLeaderQueryCriteria criteria) {
        List<DeptLeader> list = deptLeaderRepository.findAll((root, query, cb) -> QueryHelp.getPredicate(root, criteria, cb));
        return deptLeaderMapper.toDto(list);
    }
}
