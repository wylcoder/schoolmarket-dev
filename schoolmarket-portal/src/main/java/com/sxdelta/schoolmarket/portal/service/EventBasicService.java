package com.sxdelta.schoolmarket.portal.service;

import com.sxdelta.schoolmarket.model.SmEventComment;
import com.sxdelta.schoolmarket.model.SmEventInfo;
import com.sxdelta.schoolmarket.model.SmUserInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface EventBasicService {

    /**
     * 发布动态
     */
    void addEvent(SmEventInfo smEventInfo, HttpServletRequest request);

    /**
     * 展示我的动态列表
     */
    List<SmEventInfo> getMyEventList(String userID);

    /**
     * 删除我的动态
     */
    void deleteMyEvent(List<SmEventInfo> deleteEventList);

    /**
     * 评论
     */
    void addComment(SmEventComment smEventComment);

    /**
     * 删除
     */
    void deleteComment(SmEventComment smEventComment);

    /**
     * 添加收藏
     */
    void addEventCollect(String userID, String eventID);

    /**
     * 删除收藏
     */
    void deleteEventCollect(String userID, String eventID);

    /**
     * 添加点赞
     */
    void addEventStar(String userID, String eventID);

    /**e
     * 删除点赞
     */
    void deleteEventStar(String userID, String eventID);

    /**
     * 统计评论数量
     */
    int countEventCommentNum(String eventID);

    /**
     * 统计收藏数量
     */
    int countEventCollectNum(String eventID);

    /**
     * 统计点赞数量
     */
    int CountEventStarNum(String eventID);

    /**
     * 获取单条动态信息
     */
    SmEventInfo getSmEventInfo(String eventID);

    /**
     * 添加点赞，评论，收藏统一入口（暂时不做）
     */
}
