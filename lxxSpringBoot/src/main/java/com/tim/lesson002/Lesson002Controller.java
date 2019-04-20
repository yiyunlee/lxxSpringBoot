package com.tim.lesson002;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tim.common.BookVO;

@RestController
@RequestMapping("/002")
public class Lesson002Controller {

	@RequestMapping("/bookVO")
	public BookVO getBookVO() {
		BookVO vo = new BookVO();
		vo.setBookId(123456L);
		vo.setBookName("Holly Bible");
		return vo;
	}

}
