package com.ryan.springboothello;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//http://127.0.0.1:8080/springboot/templates/hello2
@RequestMapping("/templates")
public class TemplatesController {
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map){
		map.put("name","tommy" );
		return "hello";
	}
	@RequestMapping("/hello2")
	public ModelAndView hello2(){
		//返回的是ModelAndView
		ModelAndView mv=new ModelAndView("hello");
		return mv;
		
	}
}
