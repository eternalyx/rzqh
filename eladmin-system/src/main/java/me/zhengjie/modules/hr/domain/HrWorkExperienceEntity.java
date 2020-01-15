package me.zhengjie.modules.hr.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 工作经验表
 *
 * @author zhoudanwei
 * @date 2020-01-14 18:36:13
 */
public class HrWorkExperienceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //ID
    private String id;
    //员工id
    private String employeeId;
    //岗位名称
    private String postName;
    //公司名称
    private String companyName;
    //开始时间
    private Date beginDate;
    //结束时间
    private Date endDate;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //备注
    private String remark;

    /**
     * 设置：ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置：员工id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取：员工id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置：岗位名称
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * 获取：岗位名称
     */
    public String getPostName() {
        return postName;
    }

    /**
     * 设置：公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取：公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置：开始时间
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取：开始时间
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置：结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取：结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注
     */
    public String getRemark() {
        return remark;
    }
}
