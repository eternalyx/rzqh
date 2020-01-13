package me.zhengjie.domain;

import org.springframework.beans.factory.annotation.Autowired;

import me.zhengjie.BaseTest;
import me.zhengjie.modules.system.domain.entity.SysDeptExamineProcessDO;
import me.zhengjie.modules.system.domain.mapper.SysDeptExamineProcessMapper;
import org.junit.Test;

/**
 * @author: xiaoqi
 * @date: 2020/1/14
 */
public class SysDeptExamineProcessMapperTest extends BaseTest {

    @Autowired
    private SysDeptExamineProcessMapper sysDeptExamineProcessMapper;

    @Test
    public void test() {
        SysDeptExamineProcessDO sysDeptExamineProcessDO = sysDeptExamineProcessMapper.queryByDeptId("123");
        System.out.println(sysDeptExamineProcessDO.toString());
    }

}
