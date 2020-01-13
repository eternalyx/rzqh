package me.zhengjie.modules.system.domain.entity;

import lombok.Data;

/**
 * @author: xiaoqi
 * @date: 2020/1/14
 */
@Data
public class SysDeptExamineProcessDO {

    /**
     * 主键id
     */
    private String id;

    /**
     * 部门id
     */
    private String deptId;

    /**
     * 审批部门id
     */
    private String examineDeptId;
}
