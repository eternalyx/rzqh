package me.zhengjie.modules.hr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工资发放管理表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:40
 */
@Getter
@Setter
public class HrSalaryManagementEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private String id;
	//工资年月
	private Date salaryDate;
	//员工id
	private String employeeId;
	//状态：0：正式 1：试用
	private Integer status;
	//补贴工资
	private BigDecimal subsidySalary;
	//加班工资
	private BigDecimal overtimeSalary;
	//提成工资
	private BigDecimal royaltySalary;
	//考勤扣款
	private BigDecimal attendanceDeduction;
	//其它扣款
	private BigDecimal otherDeduction;
	//应发工资
	private BigDecimal wagesSalary;
	//个人社保总扣除
	private BigDecimal personalSocialSecurityTotalCost;

}
