package me.zhengjie.modules.system.domain.mapper;

import org.apache.ibatis.annotations.Param;

import me.zhengjie.modules.system.domain.entity.SysDeptExamineProcessDO;

/**
 * @author: xiaoqi
 * @date: 2020/1/14
 */
public interface SysDeptExamineProcessMapper extends BaseMapper {

    /**
     * 通过部门id查询下一个审批部门
     */
    SysDeptExamineProcessDO queryByDeptId(@Param("deptId") String deptId);

}
