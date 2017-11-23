package com.ryan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.ryan.demo.bean.Cat;
import com.ryan.demo.service.CatService;

@RestController
public class CatController {

	@Autowired
	private CatService catService;
	@RequestMapping("/likeName")
	public List<Cat> likeName(String name){
		//第几页，页条数
		PageHelper.startPage(1, 1);
		List<Cat> list=catService.likeName(name);
		return list;
		
	}
}
