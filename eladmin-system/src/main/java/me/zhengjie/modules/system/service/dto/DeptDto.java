package me.zhengjie.modules.system.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import me.zhengjie.annotation.Excel;
import me.zhengjie.annotation.Excel.ColumnType;
import me.zhengjie.annotation.Excel.Type;

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
    @Excel(name = "岗位编码")
    private String name;
    private String pid;
    @NotNull
    @Excel(name = "部门状态", readConverterExp = "true=正常,false=停用")
    private Boolean enabled;
    @Excel(name = "岗位排序", cellType = ColumnType.NUMERIC)
    private int sort;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptDto> children;
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd", type = Type.EXPORT)
    private Timestamp createTime;
}
