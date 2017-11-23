package com.ryan.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ryan.demo.bean.Cat;

public interface CatMapper {
	//#{name}参数占位符
	@Select("select * from Cat where name = #{name}")
	public List<Cat> likeName(String name);
	
	@Select("select * from Cat where id = #{id}")
	public Cat getById(int id);
	
	@Select("select * name from Cat where id = #{id}")
	public String getNameById(int id);
}
