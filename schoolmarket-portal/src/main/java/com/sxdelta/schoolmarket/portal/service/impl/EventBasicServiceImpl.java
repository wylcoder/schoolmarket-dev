package com.sxdelta.schoolmarket.portal.service.impl;

import com.sxdelta.schoolmarket.common.exception.Asserts;
import com.sxdelta.schoolmarket.mapper.SmEventCollectMapper;
import com.sxdelta.schoolmarket.mapper.SmEventCommentMapper;
import com.sxdelta.schoolmarket.mapper.SmEventInfoMapper;
import com.sxdelta.schoolmarket.mapper.SmEventStarMapper;
import com.sxdelta.schoolmarket.model.*;
import com.sxdelta.schoolmarket.portal.dto.OssCallbackResult;
import com.sxdelta.schoolmarket.portal.service.EventBasicService;
import com.sxdelta.schoolmarket.portal.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class EventBasicServiceImpl implements EventBasicService {

    @Autowired
    SmEventInfoMapper smEventInfoMapper;
    @Autowired
    SmEventCommentMapper smEventCommentMapper;
    @Autowired
    SmEventCollectMapper smEventCollectMapper;
    @Autowired
    SmEventStarMapper smEventStarMapper;
    @Autowired
    OssService ossService;
    @Override
    public void addEvent(SmEventInfo smEventInfo, HttpServletRequest request) {
        String eventID = UUID.randomUUID().toString().substring(24);//生成动态的ID，同时作为
        Date create_time = new Date();
        smEventInfo.setEventId(eventID);
        smEventInfo.setCreateTime(create_time);
        smEventInfo.setUpdateTime(create_time);
        smEventInfo.setCommentNum(0);
        smEventInfo.setCollectNum(0);
        smEventInfo.setStartNum(0);
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        smEventInfo.setEventPicture(ossCallbackResult.getFilename());
        smEventInfoMapper.insert(smEventInfo);
    }

    @Override
    public List<SmEventInfo> getMyEventList(String userID) {
        SmEventInfoExample example = new SmEventInfoExample();
        example.createCriteria().andUserIdEqualTo(userID);
        List<SmEventInfo> eventList = smEventInfoMapper.selectByExample(example);
        return eventList;
    }

    @Override
    public void deleteMyEvent(List<SmEventInfo> deleteEventList) {
        String userID = "";
        List<String> eventIDList = new ArrayList<>();
        if(deleteEventList == null){
            Asserts.fail("无要删除的动态");
        }else{
            userID = deleteEventList.get(0).getUserId();
        }
        for(SmEventInfo smEventInfo : deleteEventList){
            eventIDList.add(smEventInfo.getEventId());
        }
        SmEventInfoExample example = new SmEventInfoExample();
        example.createCriteria().andUserIdEqualTo(userID).andEventIdIn(eventIDList);
        smEventInfoMapper.deleteByExample(example);
    }

    @Override
    public void addComment(SmEventComment smEventComment) {
        if(smEventComment == null){
            Asserts.fail("参数有误");
        }
        smEventCommentMapper.insert(smEventComment);
        String eventID = smEventComment.getEventId();
        opeEventParam(eventID, 0,1);
    }

    @Override
    public void deleteComment(SmEventComment smEventComment) {
        if(smEventComment == null){
            Asserts.fail("参数有误");
        }
        SmEventCommentExample example = new SmEventCommentExample();
        example.createCriteria().andEventIdEqualTo(smEventComment.getEventId());
        smEventCommentMapper.deleteByExample(example);
        String eventID = smEventComment.getEventId();
        opeEventParam(eventID, 1, 1);
    }

    @Override
    public void addEventCollect(String userID, String eventID) {
        SmEventCollect smEventCollect = new SmEventCollect();
        smEventCollect.setUserId(userID);
        smEventCollect.setEventId(eventID);
        smEventCollect.setCreateTime(new Date());
        smEventCollectMapper.insert(smEventCollect);
        opeEventParam(eventID, 0, 2);
    }

    @Override
    public void deleteEventCollect(String userID, String eventID) {
        SmEventCollect smEventCollect = new SmEventCollect();
        smEventCollect.setUserId(userID);
        smEventCollect.setEventId(eventID);
        smEventCollect.setCreateTime(new Date());
        SmEventCollectExample example = new SmEventCollectExample();
        example.createCriteria().andUserIdEqualTo(userID).andEventIdEqualTo(eventID);
        smEventCollectMapper.deleteByExample(example);
        opeEventParam(eventID, 1, 2);
    }

    @Override
    public void addEventStar(String userID, String eventID) {
        SmEventStar smEventStar = new SmEventStar();
        smEventStar.setUserId(userID);
        smEventStar.setEventId(eventID);
        smEventStar.setCreateTime(new Date());
        smEventStarMapper.insert(smEventStar);
        opeEventParam(eventID, 0,3);
    }

    @Override
    public void deleteEventStar(String userID, String eventID) {
        SmEventStar smEventStar = new SmEventStar();
        smEventStar.setUserId(userID);
        smEventStar.setEventId(eventID);
        smEventStar.setCreateTime(new Date());
        SmEventStarExample example = new SmEventStarExample();
        example.createCriteria().andUserIdEqualTo(userID).andEventIdEqualTo(eventID);
        smEventStarMapper.deleteByExample(example);
        opeEventParam(eventID, 1, 3);
    }

    public void opeEventParam(String eventID, int opeType, int contentType){
        SmEventInfo event = getSmEventInfo(eventID);
        SmEventInfoExample example = new SmEventInfoExample();
        if(opeType == 0){//添加
            if(contentType == 1){
                event.setCommentNum(event.getCommentNum()+1);
            }else if(contentType == 2){
                event.setCollectNum(event.getCollectNum()+1);
            }else{
                event.setStartNum(event.getStartNum()+1);
            }
        }else{//刪除
            if(contentType == 1){
                event.setCommentNum(event.getCommentNum()-1);
            }else if(contentType == 2){
                event.setCollectNum(event.getCollectNum()-1);
            }else{
                event.setStartNum(event.getStartNum()-1);
            }
        }
        example.createCriteria().andEventIdEqualTo(event.getEventId());
        smEventInfoMapper.updateByExample(event, example);
    }

    @Override
    public int countEventCommentNum(String eventID) {
        SmEventCommentExample example = new SmEventCommentExample();
        example.createCriteria().andEventIdEqualTo(eventID);
        return (int)smEventCommentMapper.countByExample(example);
    }

    @Override
    public int countEventCollectNum(String eventID) {
        SmEventCollectExample example = new SmEventCollectExample();
        example.createCriteria().andEventIdEqualTo(eventID);
        return (int)smEventCollectMapper.countByExample(example);
    }

    @Override
    public int CountEventStarNum(String eventID) {
        SmEventStarExample example = new SmEventStarExample();
        example.createCriteria().andEventIdEqualTo(eventID);
        return (int)smEventStarMapper.countByExample(example);
    }

    @Override
    public SmEventInfo getSmEventInfo(String eventID) {
        SmEventInfoExample example = new SmEventInfoExample();
        example.createCriteria().andEventIdEqualTo(eventID);
        return smEventInfoMapper.selectByExample(example).get(0);
    }


}
