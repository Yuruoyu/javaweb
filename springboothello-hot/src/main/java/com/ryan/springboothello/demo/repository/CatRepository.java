package com.ryan.springboothello.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ryan.springboothello.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>
{
	
}
