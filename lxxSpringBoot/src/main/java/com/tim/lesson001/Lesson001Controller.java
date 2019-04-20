package com.tim.lesson001;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Lesson-001 起步HelloWorld
 * @author yiyunLee
 * @since 2019年4月20日
 */
@RequestMapping("/001")
@RestController
public class Lesson001Controller {

	@RequestMapping("/hello")
	public String hello()
	{
		return "Lesson 001 哈哈";
	}
	
}
