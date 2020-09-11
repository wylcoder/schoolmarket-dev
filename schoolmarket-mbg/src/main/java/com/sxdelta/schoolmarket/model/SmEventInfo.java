package com.sxdelta.schoolmarket.model;

import java.io.Serializable;
import java.util.Date;

public class SmEventInfo implements Serializable {
    private Long id;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 用户动态ID
     *
     * @mbg.generated
     */
    private String eventId;

    /**
     * 内容
     *
     * @mbg.generated
     */
    private String eventContent;

    /**
     * 图片URL
     *
     * @mbg.generated
     */
    private String eventPicture;

    /**
     * 话题
     *
     * @mbg.generated
     */
    private String eventTopic;

    /**
     * 学校
     *
     * @mbg.generated
     */
    private String eventSchool;

    /**
     * 查看权限:0->ALL 1->FRIEND 2->ME
     *
     * @mbg.generated
     */
    private Integer eventViewpermission;

    /**
     * 评论权限
     *
     * @mbg.generated
     */
    private Integer eventCommentspermission;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private Date updateTime;

    /**
     * 点赞数
     *
     * @mbg.generated
     */
    private Integer startNum;

    /**
     * 收藏数
     *
     * @mbg.generated
     */
    private Integer collectNum;

    /**
     * 评论数
     *
     * @mbg.generated
     */
    private Integer commentNum;

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

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public String getEventPicture() {
        return eventPicture;
    }

    public void setEventPicture(String eventPicture) {
        this.eventPicture = eventPicture;
    }

    public String getEventTopic() {
        return eventTopic;
    }

    public void setEventTopic(String eventTopic) {
        this.eventTopic = eventTopic;
    }

    public String getEventSchool() {
        return eventSchool;
    }

    public void setEventSchool(String eventSchool) {
        this.eventSchool = eventSchool;
    }

    public Integer getEventViewpermission() {
        return eventViewpermission;
    }

    public void setEventViewpermission(Integer eventViewpermission) {
        this.eventViewpermission = eventViewpermission;
    }

    public Integer getEventCommentspermission() {
        return eventCommentspermission;
    }

    public void setEventCommentspermission(Integer eventCommentspermission) {
        this.eventCommentspermission = eventCommentspermission;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", eventId=").append(eventId);
        sb.append(", eventContent=").append(eventContent);
        sb.append(", eventPicture=").append(eventPicture);
        sb.append(", eventTopic=").append(eventTopic);
        sb.append(", eventSchool=").append(eventSchool);
        sb.append(", eventViewpermission=").append(eventViewpermission);
        sb.append(", eventCommentspermission=").append(eventCommentspermission);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", startNum=").append(startNum);
        sb.append(", collectNum=").append(collectNum);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}