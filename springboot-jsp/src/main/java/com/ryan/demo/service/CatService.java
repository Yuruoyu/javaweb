package com.ryan.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.demo.bean.Cat;
import com.ryan.demo.mapper.CatMapper;

@Service
public class CatService {
	
	@Autowired
	private CatMapper catMapper;
	
	public List<Cat> likeName(String name){
		System.out.println(catMapper);
		return catMapper.likeName(name);
	}
}
