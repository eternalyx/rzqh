package me.zhengjie.modules.hr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工资轨迹表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:33
 */
@Getter
@Setter
public class HrSalaryTrackEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private String id;
	//工资表ID
	private String salaryId;
	//基本工资
	private BigDecimal baseSalary;
	//绩效工资
	private BigDecimal assessmentSalary;
	//变更开始年月
	private Date startDate;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

}
