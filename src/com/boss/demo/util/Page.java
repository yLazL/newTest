/**
 * 
 */
package com.boss.demo.util;

/**
 * @title  Page.java
 * @author �����ˣ��⽣��
 * @date 2014-7-14 ����11:15:52
 * @description TODO
 * @version �汾��V1.0
 */
public class Page {
	private Integer pageNow=1; //��ǰҳ
	private Integer totalRows=0; //�ܼ�¼��
	private Integer pageSize=3; //һҳ�ļ�¼��
	private Integer pageCount; //��ҳ��
	private Integer start; //��ǰҳ�ĵ�һ����¼����
	private Integer end; //��ǰҳ�����һ����¼����
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
