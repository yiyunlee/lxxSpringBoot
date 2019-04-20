package com.tim.common;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookVO implements Serializable {

	private static final long serialVersionUID = -3401048844460408309L;
	
	/**
	 * 图书id
	 */
	private Long bookId;

	/**
	 * 图书name
	 */
	private String bookName;

}
