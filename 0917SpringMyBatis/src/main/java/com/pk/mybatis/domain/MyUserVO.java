package com.pk.mybatis.domain;

public class MyUserVO {
	private String id;
    private String pw;
	private String name;
    private String phone;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MyUserVO [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + "]";
	}
}