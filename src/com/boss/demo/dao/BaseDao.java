/**
 * 
 */
package com.boss.demo.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @title  BaseDao.java
 * @author 创建人：吴剑雄
 * @date 2014-7-10 下午12:49:55
 * @description TODO
 * @version 版本：V1.0
 */
public interface BaseDao {
	public SqlMapClient getSqlMapClientRef();
}
