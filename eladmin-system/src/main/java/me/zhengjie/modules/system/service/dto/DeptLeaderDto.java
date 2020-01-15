package me.zhengjie.modules.system.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
* @author liucw
* @date 2019-04-10
*/
@Getter
@Setter
public class DeptLeaderDto implements Serializable {

    private String id;

    private String deptID;

    private String userId;

    private String level;
}
