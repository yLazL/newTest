/**
 * 
 */
package com.boss.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boss.demo.dao.UserDao;
import com.boss.demo.entity.User;
import com.boss.demo.service.UserService;

/**
 * @title  UserServiceImpl.java
 * @author 创建人：吴剑雄
 * @date 2014-7-10 下午12:23:15
 * @description TODO
 * @version 版本：V1.0
 */
@Service("UserService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 添加用户
	 * @throws Exception 
	 */
	@Transactional(rollbackFor=Exception.class)
	public void saveUser(User user) throws Exception {
		try {
			userDao.addUser(user);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		
	}
	
	@Transactional(readOnly=true)
	public List<User> showUsers(Map<String, Object> map) throws Exception {
		List<User> userList = null;
		try {
			userList=userDao.loadAllUser(map);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return userList;
		
	}
	@Transactional(rollbackFor=Exception.class)
	public void removeUser(Integer userID) throws Exception {
		try {
			userDao.deleteByUserID(userID);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	@Transactional(readOnly=true)
	public User loadUser(Integer userID) throws Exception {
		User user=null;
		try {
			user=userDao.loadByUserID(userID);
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return user;
	}
	@Transactional(rollbackFor=Exception.class)
	public void modifyUser(User user) throws Exception{
		try {
			if(user!=null)
				userDao.updateUser(user);
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	@Transactional(readOnly=true)
	public List<Map<String, Object>> searchUsersByName_No(Map<String, Object> map) throws Exception {
		
		List<Map<String, Object>> userList = null;
		try {
			userList=userDao.loadByName_No(map);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return userList;
	}
	@Transactional(readOnly=true)
	public User findByAccountNo(String accountNo) throws Exception {
		User user=null;
		try {
			user=userDao.loadByAccountNo(accountNo);
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return user;
	}
	@Transactional(readOnly=true)
	public String findPwdByAccountNo(String accountNo) throws Exception {
		String pwd=null;
		try {
			pwd=userDao.loadPwdByAccountNo(accountNo);
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return pwd;
	}

	public Integer loadUserCount(User user) {
		
		return userDao.loadUserCount(user);
	}

	
}
