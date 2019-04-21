package com.tim.lesson009;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/009")
public class Lesson009Controller {

	@Autowired
	private DogDao dogDao;

	@RequestMapping("/add")
	public String add() {
		dogDao.add();
		return "新增了一只狗！！！";
	}
	
	@RequestMapping("/find")
	public DogVO findDogByDogId(Long dogId, String hahaha) {		
		//使用RequestMapping注解下,允许参数不存在
		return dogDao.finDogByDogId(dogId);		
	}

}
