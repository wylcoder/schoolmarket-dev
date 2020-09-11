package com.sxdelta.schoolmarket.portal.component;

import com.sxdelta.schoolmarket.portal.service.EventBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class AsynUpdateEventTask {

    @Autowired
    private EventBasicService eventBasicService;

    @Scheduled(cron = "0 0/3 * ? * ?")
    public void updateEventTask(){
        //int commentNum = eventBasicService.countEventCommentNum();
    }
}
