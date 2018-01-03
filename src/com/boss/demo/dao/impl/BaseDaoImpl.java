/**
 * 
 */
package com.boss.demo.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.boss.demo.dao.BaseDao;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

/**
 * @title  BaseDaoImpl.java
 * @author 创建人：吴剑雄
 * @date 2014-7-10 下午01:07:17
 * @description TODO
 * @version 版本：V1.0
 */
public class BaseDaoImpl extends SqlMapClientDaoSupport implements BaseDao {

	@Resource(name="sqlMapClient")
	private SqlMapClient sqlMapClient;

	public SqlMapClient getSqlMapClientRef() {
		return sqlMapClient;
	}
	@PostConstruct
	public void initSqlMapClient(){
		super.setSqlMapClient(sqlMapClient);
	}
	/**
	 * 
	 * 函数名称：save
	 * 功能说明：添加
	 * 参数说明：
	 * @return Object
	 * @param statementName
	 * @param parameterObject
	 */
	public Object save(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().insert(statementName, parameterObject);
	}
	public List find(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().queryForList(statementName, parameterObject);
	}
	public Object count(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().queryForObject(statementName,parameterObject);
	}
	public int delete(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().delete(statementName, parameterObject);
	}
	public Object findByID(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().queryForObject(statementName, parameterObject);
	}
	public int update(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().update(statementName, parameterObject);
	}
	public List search(String statementName,Object parameterObject){
		return getSqlMapClientTemplate().queryForList(statementName, parameterObject);
	}
}
