package com.ryan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	
@MapperScan("com.ryan.*.mapper")//扫描：当前包下的持久化类,指定扫描mapper包，会根据CatMapper定义，生成动态代理对象。
public class App {
	public static void main(String[] args){
		SpringApplication.run(App.class, args);
	}
}
