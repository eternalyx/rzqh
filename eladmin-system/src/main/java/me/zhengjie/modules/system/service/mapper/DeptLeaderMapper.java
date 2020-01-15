package me.zhengjie.modules.system.service.mapper;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.modules.system.domain.DeptLeader;
import me.zhengjie.modules.system.service.dto.DeptLeaderDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author liucw
* @date 2020-01-16
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptLeaderMapper extends BaseMapper<DeptLeaderDto, DeptLeader> {

}