package me.zhengjie.modules.system.service;

import me.zhengjie.modules.system.domain.Dept;
import me.zhengjie.modules.system.service.dto.DeptDto;
import me.zhengjie.modules.system.service.dto.DeptLeaderDto;
import me.zhengjie.modules.system.service.dto.DeptLeaderQueryCriteria;
import me.zhengjie.modules.system.service.dto.DeptQueryCriteria;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
* @author liucw
* @date 2019-03-25
*/
public interface DeptLeaderService {

    /**
     * 查询所有数据
     * @param criteria 条件
     * @return /
     */
    List<DeptLeaderDto> queryAll(DeptLeaderQueryCriteria criteria);

}
