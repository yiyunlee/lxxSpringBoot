package com.tim.lesson008;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/008")
public class Lesson008Controller {
	
	@Autowired
	private CatRepository catRepository;

	@RequestMapping("/add")
	public void add() {
		CatVO vo = new CatVO();
		vo.setCatName("cat"+Math.round(Math.random()*1000));
		catRepository.save(vo);
	}
	
}
