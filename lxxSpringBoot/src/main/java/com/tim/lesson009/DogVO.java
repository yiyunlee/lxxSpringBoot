package com.tim.lesson009;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lesson009_dog")
public class DogVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long dogId;	
	
	@Column
	private String dogName;

}
