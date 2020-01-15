package me.zhengjie.config;

import me.zhengjie.modules.system.service.DeptLeaderService;
import me.zhengjie.modules.system.service.DeptService;
import me.zhengjie.modules.system.service.RoleService;
import me.zhengjie.modules.system.service.UserService;
import me.zhengjie.modules.system.service.dto.DeptLeaderDto;
import me.zhengjie.modules.system.service.dto.DeptLeaderQueryCriteria;
import me.zhengjie.modules.system.service.dto.UserDto;
import me.zhengjie.utils.SecurityUtils;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 数据权限通用方法
 */
@Component
public class BusinessDataScop {
    private final DeptLeaderService deptLeaderService;

    public BusinessDataScop(DeptLeaderService deptLeaderService) {
        this.deptLeaderService = deptLeaderService;
    }
    public List<DeptLeaderDto> getDeptIds()
    {
        DeptLeaderQueryCriteria criteria = new DeptLeaderQueryCriteria();
        criteria.setUserId(SecurityUtils.getUserId());
        return deptLeaderService.queryAll(criteria);
    }

    /**
     *  获取当前登录人为主管的机构IDs
     * @return
     */
    public List<DeptLeaderDto> getDeptIdsCharge()
    {
        DeptLeaderQueryCriteria criteria = new DeptLeaderQueryCriteria();
        criteria.setUserId(SecurityUtils.getUserId());
        criteria.setLevel("1");
        return deptLeaderService.queryAll(criteria);
    }

    /**
     *  获取当前登录人为主管的机构IDs
     * @return
     */
    public List<DeptLeaderDto> getDeptIdsForAssistant()
    {
        DeptLeaderQueryCriteria criteria = new DeptLeaderQueryCriteria();
        criteria.setUserId(SecurityUtils.getUserId());
        criteria.setLevel("2");
        return deptLeaderService.queryAll(criteria);
    }
}
