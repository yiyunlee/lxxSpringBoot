package com.tim.lesson008;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lesson008_cat")
public class CatVO {

	@Id
	@GeneratedValue
	private Long catId;
	
	@Column(name="cat_name")
	private String catName;
	
}
