/**
 * 
 */
package com.boss.demo.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.boss.demo.dao.UserDao;
import com.boss.demo.entity.User;

/**
 * @title  UserDaoImpl.java
 * @author 创建人：吴剑雄
 * @date 2014-7-10 下午12:22:39
 * @description TODO
 * @version 版本：V1.0
 */
@Component("UserDao")
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	public void addUser(User user) {
		save("addUser", user);
	}

	public List<User> loadAllUser(Map<String, Object> map) {
		List<User> user_list= find("selectAllUser",map);
		return user_list;
	}

	public void deleteByUserID(Integer userID) {
		
		delete("deleteUserById", userID);
	}

	public User loadByUserID(Integer userID) {
		User user = (User)findByID("selectUserById", userID);
		return user;
	}
	public User loadByAccountNo(String accountNo) {
		User user = (User)findByID("selectUserByNo", accountNo);
		return user;
	}
	public String loadPwdByAccountNo(String accountNo){
		String pwd = (String)findByID("selectPwdByNo",accountNo);
		return pwd;
	}
	public void updateUser(User user) {
		
		update("updateUser", user);
	}
	
	public List<Map<String, Object>>  loadByName_No(Map<String, Object> map){
		List<Map<String, Object>> list=null;
		if(map.get("accountNo").equals(""))
			list=search("selectUsersByName", map);
		else if(map.get("name").equals(""))
			list=search("selectUsersByAccountNo", map);
		else
			list=search("selectUsersByName_No", map);
		return list;
	}

	public Integer loadUserCount(User user) {
		Integer count = (Integer)count("selectUserCount",user);
		return count;
	}

}
