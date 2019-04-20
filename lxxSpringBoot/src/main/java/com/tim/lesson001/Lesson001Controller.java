package com.tim.lesson001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/001")
@RestController
public class Lesson001Controller {

	@RequestMapping("/hello")
	public String hello()
	{
		return "Lesson 001 哈哈";
	}
	
}
