package me.zhengjie.modules.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * @author Zheng Jie
 * @date 2019-03-25
 */
@Entity
@Table(name = "sys_dept_leader")
@Getter
@Setter
public class SysDeptLeader {

    @Id
    @NotNull(groups = {SysDeptLeader.Update.class})
    private String id;

    @Column(name = "dept_id")
    @NonNull
    private String deptId;

    @Column(name = "user_id")
    @NonNull
    private String userId;

    @Column(name = "level")
    @NonNull
    private String level;
    
    private String nickname;

    public @interface Update {
    }
}
