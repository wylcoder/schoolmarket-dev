package com.sxdelta.schoolmarket.portal.controller;

import com.sxdelta.schoolmarket.common.api.CommonResult;
import com.sxdelta.schoolmarket.model.SmEventComment;
import com.sxdelta.schoolmarket.model.SmEventInfo;
import com.sxdelta.schoolmarket.model.SmUserInfo;
import com.sxdelta.schoolmarket.portal.service.EventBasicService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户动态控制类
 */
@RestController
@RequestMapping(value = "/event")
public class EventBasicController {

    @Autowired
    EventBasicService eventBasicService;

    @ApiOperation("添加动态")
    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public CommonResult addEvent(@RequestBody SmEventInfo smEventInfo,
                                 HttpServletRequest request){
        eventBasicService.addEvent(smEventInfo, request);
        return CommonResult.success(null, "添加成功");
    }

    @ApiOperation("展示我的动态")
    @RequestMapping(value = "/getMyEventList", method = RequestMethod.POST)
    public CommonResult getMyEventList(@RequestParam String userID){
        List<SmEventInfo> list = eventBasicService.getMyEventList(userID);
        return CommonResult.success(list);
    }

    @ApiOperation("删除动态")
    @RequestMapping(value = "/deleteMyEvent", method = RequestMethod.POST)
    public CommonResult deleteMyEvent(@RequestBody List<SmEventInfo> deleteEventList){
        eventBasicService.deleteMyEvent(deleteEventList);
        return CommonResult.success(null, "删除成功");
    }

    @ApiOperation("添加评论")
    @RequestMapping(value = "/addComment")
    public CommonResult addComment(@RequestBody SmEventComment smEventComment){
        eventBasicService.addComment(smEventComment);
        return CommonResult.success(null);
    }

    @ApiOperation("发表此评论的用户可删除此评论")
    @RequestMapping(value = "/deleteComment")
    public CommonResult deleteComment(@RequestBody SmEventComment smEventComment){
        eventBasicService.deleteComment(smEventComment);
        return CommonResult.success(null);
    }

    @ApiOperation("添加动态收藏")
    @RequestMapping(value = "/addEventCollect")
    public CommonResult addEventCollect(@RequestParam String userID,
                                        @RequestParam String eventID){
        eventBasicService.addEventCollect(userID, eventID);
        return CommonResult.success(null);
    }

    @ApiOperation("删除收藏动态")
    @RequestMapping(value = "/deleteEventCollect")
    public CommonResult deleteEventCollect(@RequestParam String userID,
                                           @RequestParam String eventID){
        eventBasicService.deleteEventCollect(userID, eventID);
        return CommonResult.success(null);
    }

    @ApiOperation("添加点赞")
    @RequestMapping(value = "/addEventStar")
    public CommonResult addEventStar(@RequestParam String userID,
                                     @RequestParam String eventID){
        eventBasicService.addEventStar(userID, eventID);
        return CommonResult.success(null);
    }

    @ApiOperation("删除点赞")
    @RequestMapping(value = "/deleteEventStar")
    public CommonResult deleteEventStar(@RequestParam String userID,
                                        @RequestParam String eventID){
        eventBasicService.deleteEventStar(userID, eventID);
        return CommonResult.success(null);
    }
}
