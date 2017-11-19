package com.ryan.springboothello.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 创建一个实体类
 * 
 * 使用Entity　进行持久化
 * 当JPA检测到我们的实体类当中有@Entity时候，会在数据库中生成对应的表结构信息
 * 
 * 
 * @author Laird
 *
 */
@Entity
public class Dog {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Name;
	private int dogAge;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	
}
