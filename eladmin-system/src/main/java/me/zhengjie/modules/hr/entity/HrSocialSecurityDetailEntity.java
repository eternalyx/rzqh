package me.zhengjie.modules.hr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 社保缴费明细表
 * 
 * @author liuyi
 * @date 2020-01-14 15:57:31
 */
@Getter
@Setter
public class HrSocialSecurityDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private String id;
	//账单年月（缴费年月）
	private Date billDate;
	//费用年月
	private Date costDate;
	//社保基数
	private Integer baseSocialSecurity;
	//公积金基数
	private Integer baseProvidentFund;
	//个人社保扣除
	private BigDecimal personalSocialSecurityCost;
	//个人公积金扣除
	private BigDecimal personalProvidentFundCost;
	//公司社保扣除
	private BigDecimal companySocialSecurityCost;
	//公司公积金扣除
	private BigDecimal companyProvidentFundCost;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

}
