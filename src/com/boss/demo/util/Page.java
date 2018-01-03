/**
 * 
 */
package com.boss.demo.util;

/**
 * @title  Page.java
 * @author 创建人：吴剑雄
 * @date 2014-7-14 上午11:15:52
 * @description TODO
 * @version 版本：V1.0
 */
public class Page {
	private Integer pageNow=1; //当前页
	private Integer totalRows=0; //总记录数
	private Integer pageSize=3; //一页的记录数
	private Integer pageCount; //总页数
	private Integer start; //当前页的第一个记录索引
	private Integer end; //当前页的最后一个记录索引
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}
	public Integer getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageCount() {
		Integer res=totalRows/pageSize;
		return totalRows%pageSize==0?res:res+1;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getStart() {
		return (pageNow-1)*pageSize;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return pageNow*pageSize;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	
	
	
	
}
