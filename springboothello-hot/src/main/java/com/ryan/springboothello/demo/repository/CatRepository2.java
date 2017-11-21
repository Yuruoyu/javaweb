package com.ryan.springboothello.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.ryan.springboothello.demo.bean.Cat;

public interface CatRepository2 extends Repository<Cat, Integer>
{
	/**
	 * 1/查詢方法以get|find|read開頭
	 * 2/條件的屬性由條件關鍵字鏈接
	 * @param catName
	 * @return
	 */
	/*public Cat findByName(String name);*/
	/*@Query("from Cat Where name=:cn")
	public Cat findMyCatName(@Param("cn")String name);*/
	
}
