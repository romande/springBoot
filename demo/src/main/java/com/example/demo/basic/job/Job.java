package com.example.demo.basic.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job {
    /**
     * 使用注解@Scheduled实现定时执行，cron的时间格式。
     * 注：另需要在main类上添加@EnableScheduled注解
     *
     * cron表达式生成器
     *      http://cron.qqe2.com
     */
    @Scheduled(cron = "0 0 18 1 * ?")
    public void consoleInfo(){
        System.out.println("定时任务");
    }
}
