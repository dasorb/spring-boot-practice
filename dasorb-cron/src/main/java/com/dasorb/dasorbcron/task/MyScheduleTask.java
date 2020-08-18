package com.dasorb.dasorbcron.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author chenjie
 * @date 2020-08-18
 */

@Component
public class MyScheduleTask {

    @Scheduled(fixedRate = 2000)
    public void runJobA(){
        System.out.println("********MyTaskA*********" + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
    }

    @Scheduled(cron = "* * * * * ?")
    public void runJobB() {
        System.out.println("********MyTaskB*********" + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
    }



}