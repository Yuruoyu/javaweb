package com.ryan;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map){
		map.put("name","ryan");
		return "hello";
	}
	@RequestMapping("/hello1")
	public String hello1(){
		return "hello1";
	}
}
