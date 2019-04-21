package com.tim.lesson009;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//下面这个注解超级重要
@Repository
public class DogDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void add() {
		String sql = "INSERT INTO `test`.`lesson009_dog` (`dog_name`) VALUES ('dd')";
		jdbcTemplate.execute(sql);
	}
	
	public DogVO finDogByDogId(Long dogId) {
		String sql = "select * from lesson009_dog t where t.dog_id = ?";
		
		//留意这里BeanPropertyRowMapper的里面还有参数DogVO.class
		RowMapper<DogVO> rowMapper = new BeanPropertyRowMapper<>(DogVO.class);	
		
		//找不到时会抛出异常
		return jdbcTemplate.queryForObject(sql, rowMapper, dogId);
	}


}
