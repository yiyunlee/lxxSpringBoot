package com.tim.lesson014;

import java.time.LocalTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


//SpringSchedule 记住下面几个注解就OK了, 一定要加入@Configuration暂时不知到底层原理
@Configuration
@EnableScheduling
public class Lesson014SpringScheduling {

	//在线cron表达式生成 http://cron.qqe2.com/
	@Scheduled(cron = "0/30 * * * * ?")
	public void scheduling() {		
		System.out.println("Spring Scheduling 定时任务调度 "+LocalTime.now());
	}
		
}
