package com.tim.lesson005;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/005")
@RestController
public class Lesson005Controller {
	
	@RequestMapping("/testException")
	public int testException()
	{
		return 5/0;
	}

}
