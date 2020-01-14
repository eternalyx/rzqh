package me.zhengjie.modules.hr.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工表
 *
 * @author zhoudanwei
 * @date 2020-01-14 18:36:13
 */
public class HrEmployeeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //ID
    private String id;
    //姓名
    private String name;
    //身份证
    private String certNo;
    //手机号
    private String phone;
    //性别 1-男 2-女
    private Integer gender;
    //邮箱
    private String email;
    //银行卡号
    private String bankNo;
    //社保缴纳地
    private String socialInsurancePlace;
    //毕业院校
    private String graduatedUniversity;
    //紧急联系人
    private String emergencyContact;
    //紧急联系人电话
    private String emergencyContactPhone;
    //家庭地址
    private String address;
    //开户行
    private String openingBank;
    //部门id
    private String deptId;
    //状态 0-在职 1-离职
    private Integer status;
    //入职日期
    private Date onboardingDate;
    //离职日期
    private Date leaveDate;
    //合同开始日
    private Date contractBeginDate;
    //合同结束日
    private Date contractEndDate;
    //简历url
    private String resumeUrl;
    //离职证明url
    private String certLeaveUrl;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

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
     * 设置：姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：身份证
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * 获取：身份证
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置：手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：性别 1-男 2-女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取：性别 1-男 2-女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置：邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取：邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置：银行卡号
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * 获取：银行卡号
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 设置：社保缴纳地
     */
    public void setSocialInsurancePlace(String socialInsurancePlace) {
        this.socialInsurancePlace = socialInsurancePlace;
    }

    /**
     * 获取：社保缴纳地
     */
    public String getSocialInsurancePlace() {
        return socialInsurancePlace;
    }

    /**
     * 设置：毕业院校
     */
    public void setGraduatedUniversity(String graduatedUniversity) {
        this.graduatedUniversity = graduatedUniversity;
    }

    /**
     * 获取：毕业院校
     */
    public String getGraduatedUniversity() {
        return graduatedUniversity;
    }

    /**
     * 设置：紧急联系人
     */
    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    /**
     * 获取：紧急联系人
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * 设置：紧急联系人电话
     */
    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    /**
     * 获取：紧急联系人电话
     */
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    /**
     * 设置：家庭地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：家庭地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置：开户行
     */
    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    /**
     * 获取：开户行
     */
    public String getOpeningBank() {
        return openingBank;
    }

    /**
     * 设置：部门id
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取：部门id
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置：状态 0-在职 1-离职
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取：状态 0-在职 1-离职
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：入职日期
     */
    public void setOnboardingDate(Date onboardingDate) {
        this.onboardingDate = onboardingDate;
    }

    /**
     * 获取：入职日期
     */
    public Date getOnboardingDate() {
        return onboardingDate;
    }

    /**
     * 设置：离职日期
     */
    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    /**
     * 获取：离职日期
     */
    public Date getLeaveDate() {
        return leaveDate;
    }

    /**
     * 设置：合同开始日
     */
    public void setContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
    }

    /**
     * 获取：合同开始日
     */
    public Date getContractBeginDate() {
        return contractBeginDate;
    }

    /**
     * 设置：合同结束日
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * 获取：合同结束日
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * 设置：简历url
     */
    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    /**
     * 获取：简历url
     */
    public String getResumeUrl() {
        return resumeUrl;
    }

    /**
     * 设置：离职证明url
     */
    public void setCertLeaveUrl(String certLeaveUrl) {
        this.certLeaveUrl = certLeaveUrl;
    }

    /**
     * 获取：离职证明url
     */
    public String getCertLeaveUrl() {
        return certLeaveUrl;
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
}
