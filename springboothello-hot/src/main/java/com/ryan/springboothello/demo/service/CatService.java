package com.ryan.springboothello.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryan.springboothello.demo.bean.Cat;
import com.ryan.springboothello.demo.repository.CatRepository;
@Service
public class CatService {
	@Resource
	private CatRepository catRepostitory;
	@Transactional
	public void save(Cat cat){
		catRepostitory.save(cat);
	}
	@Transactional
	public void delete(int id){
		catRepostitory.delete(id);
	}
	@Transactional
	public Iterable<Cat> getAll(){
		return catRepostitory.findAll();
	}
	
}
