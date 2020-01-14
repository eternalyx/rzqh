package me.zhengjie.modules.hr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 出勤表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:46
 */
@Getter
@Setter
public class HrAttendanceEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private String id;
	//员工id
	private String employeeId;
	//应上天数
	private BigDecimal dueDays;
	//出勤天数
	private BigDecimal attendanceDays;
	//加班天数
	private BigDecimal overtimeDays;
	//事假天数
	private BigDecimal leaveDays;
	//病假天数
	private BigDecimal diseaseDays;
	//婚假天数
	private BigDecimal weddingDays;
	//丧假天数
	private BigDecimal funeralDays;
	//旷工天数
	private BigDecimal absenteeismDays;
	//考勤日期
	private Date attendanceDate;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

}
