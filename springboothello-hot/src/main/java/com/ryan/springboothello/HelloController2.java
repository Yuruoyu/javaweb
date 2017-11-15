package com.ryan.springboothello;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * restcontroller等价于@controller 
 * @author Laird
 *
 */
@RestController
public class HelloController2 {
	//http://127.0.0.1:8080/hello2
	@RequestMapping("/hello2")
	public String Hello(){
		return "Hello 2 ";
	}
	
}
