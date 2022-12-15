package com.kfh.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeveloperDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Integer getCountOfDevelopers() {
		return jdbcTemplate.queryForObject(
				"select count(*) from developer",
				Integer.class);
	}
}
