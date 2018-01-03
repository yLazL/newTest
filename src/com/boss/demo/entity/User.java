/**
 * 
 */
package com.boss.demo.entity;


import java.util.Date;

/**
 * @title  User.java
 * @author 创建人：吴剑雄
 * @date 2014-7-9 下午02:51:33
 * @description TODO
 * @version 版本：V1.0
 */
public class User extends ValueObject {
	
	private Integer userID;	//用户ID
	private String accountNo; //登录账号	
	private String password; //登录密码
	
	private String name; //用户姓名
	private String email; //邮箱地址
	private String phone; //电话

	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
	
	
}
