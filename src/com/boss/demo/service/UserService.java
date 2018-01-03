/**
 * 
 */
package com.boss.demo.service;

import java.util.List;
import java.util.Map;

import com.boss.demo.entity.User;

/**
 * @title  UserService.java
 * @author 创建人：吴剑雄
 * @date 2014-7-10 下午12:20:17
 * @description TODO
 * @version 版本：V1.0
 */
public interface UserService {
	public void saveUser(User user) throws Exception;

	public List<User> showUsers(Map<String, Object> map) throws Exception;
	
	public void removeUser(Integer userID) throws Exception;
	
	public User loadUser(Integer userID) throws Exception;
	
	public void modifyUser(User user) throws Exception;
	
	public List<Map<String, Object>> searchUsersByName_No(Map<String, Object> map) throws Exception;
	
	public User findByAccountNo(String accountNo) throws Exception;
	public String findPwdByAccountNo(String accountNo) throws Exception;
	public Integer loadUserCount(User user);
}
