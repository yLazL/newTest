/**
 * 
 */
package com.boss.demo.entity;


import java.util.Date;

/**
 * @title  User.java
 * @author �����ˣ��⽣��
 * @date 2014-7-9 ����02:51:33
 * @description TODO
 * @version �汾��V1.0
 */
public class User extends ValueObject {
	
	private Integer userID;	//�û�ID
	private String accountNo; //��¼�˺�	
	private String password; //��¼����
	
	private String name; //�û�����
	private String email; //�����ַ
	private String phone; //�绰

	
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
