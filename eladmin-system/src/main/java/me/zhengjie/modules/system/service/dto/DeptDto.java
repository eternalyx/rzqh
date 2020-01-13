package me.zhengjie.modules.system.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Zheng Jie
 * @date 2019-03-25
 */
@Data
public class DeptDto implements Serializable {
    private String id;
    private String name;
    private String pid;
    @NotNull
    private Boolean enabled;
    private int sort;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptDto> children;
    private Timestamp createTime;
}
