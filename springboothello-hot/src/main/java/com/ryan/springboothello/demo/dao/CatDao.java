package com.ryan.springboothello.demo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import com.ryan.springboothello.demo.bean.Cat;
@Repository
public class CatDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	public Cat selectByName(String name){
		/**
		 * 定義一個sql語句
		 * 定義rowmapper
		 * 執行查詢方法
		 */
		String sql="select * from cat where name=?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
		Cat cat =jdbcTemplate.queryForObject(sql, new Object[]{name},rowMapper);
		return cat;
	}
}
