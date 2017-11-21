package com.ryan.springboothello.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryan.springboothello.demo.bean.Cat;
import com.ryan.springboothello.demo.dao.CatDao;
import com.ryan.springboothello.demo.repository.CatRepository;
import com.ryan.springboothello.demo.repository.CatRepository2;
@Service
public class CatService {
	@Resource
	private CatRepository catRepostitory;//只需要定義接口，spring自動注入實現類。
	/*@Resource
	private CatRepository2 catRepostitory2;*/
	@Resource
	private CatDao catDao;
	@Transactional
	public void save(Cat cat){
		catRepostitory.save(cat);
	}
	@Transactional
	public void delete(int id){
		catRepostitory.delete(id);
	}
	public Iterable<Cat> getAll(){
		return catRepostitory.findAll();
	}
	
	/*public Cat findByName(String name) {
		// TODO Auto-generated method stub
		return catRepostitory2.findByName(name);
	}*/
	public Cat selectByName(String name){
		return catDao.selectByName(name);
		
	}
	
}
