package me.zhengjie.modules.system.service.dto;

import lombok.Data;
import me.zhengjie.annotation.Query;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Data
public class DeptQueryCriteria{

    @Query(type = Query.Type.IN, propName="id")
    private Set<String> ids;

    @Query(type = Query.Type.INNER_LIKE)
    private String name;

    @Query(type = Query.Type.INNER_LIKE)
    private String charge;

    @Query(type = Query.Type.INNER_LIKE)
    private String supervisor;

    @Query
    private Boolean enabled;

    @Query
    private String pid;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
