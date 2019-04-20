package com.tim.lesson005;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	// 这课的重点是记住下面这个注解东东
	@ExceptionHandler(value = Exception.class)
	public void defaultExceptionHandler(HttpServletRequest request, Exception e)
	{
		e.printStackTrace();
		System.out.println("zzz你的请求已被劫持,请交赎金后通行！zzz");
	}

}
