package me.zhengjie.modules.hr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工资表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:44
 */
@Getter
@Setter
public class HrSalaryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private String id;
	//基本工资
	private BigDecimal baseSalary;
	//绩效工资
	private BigDecimal assessmentSalary;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

}
