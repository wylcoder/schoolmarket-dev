package com.sxdelta.schoolmarket.model;

import java.io.Serializable;
import java.util.Date;

public class SmStudentInfo implements Serializable {
    private Long id;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 学生ID
     *
     * @mbg.generated
     */
    private String studentId;

    /**
     * 学校名称
     *
     * @mbg.generated
     */
    private String schoolname;

    /**
     * 系名称
     *
     * @mbg.generated
     */
    private String departmentname;

    /**
     * 院名称
     *
     * @mbg.generated
     */
    private String institutename;

    /**
     * 班级名称
     *
     * @mbg.generated
     */
    private String classname;

    /**
     * 入学时间
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     * 离校时间
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     * 认证时间
     *
     * @mbg.generated
     */
    private Date authenticationtime;

    /**
     * 信用分数
     *
     * @mbg.generated
     */
    private Integer creditRate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getAuthenticationtime() {
        return authenticationtime;
    }

    public void setAuthenticationtime(Date authenticationtime) {
        this.authenticationtime = authenticationtime;
    }

    public Integer getCreditRate() {
        return creditRate;
    }

    public void setCreditRate(Integer creditRate) {
        this.creditRate = creditRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", studentId=").append(studentId);
        sb.append(", schoolname=").append(schoolname);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", institutename=").append(institutename);
        sb.append(", classname=").append(classname);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", authenticationtime=").append(authenticationtime);
        sb.append(", creditRate=").append(creditRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}