package com.ryan.springboothello;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/*
 * 
 */
public class Demo {
	private int id;
	private String name;
	/*
	 * 此处由fastjson包对返回的jsonmessage进行格式控制
	 */
	@JSONField(format="yyyy-mm-dd")
	private Date createTime;
	@JSONField(serialize=false)
	private String remark;
	public Date getCreateTime() {
		return createTime;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRemark() {
		return remark;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
