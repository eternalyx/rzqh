package me.zhengjie.modules.system.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.zhengjie.annotation.Query;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
* @author LIUCW
* @date 2020-1-16
*/
@Data
@NoArgsConstructor
public class DeptLeaderQueryCriteria {

    @Query(propName = "user_id",type = Query.Type.EQUAL)
    private String userId;

    @Query(propName = "dept_id",type = Query.Type.EQUAL)
    private String deptId;

    @Query(propName = "level",type = Query.Type.EQUAL)
    private String level;

}
