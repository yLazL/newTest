package com.boss.demo.action;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boss.demo.service.PoiXlsxService;
@Controller("PoiExcelAction")
public class PoiExcelAction extends BaseAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*@Autowired
	private PoiXlsxService poiXlsxService;*/
	public String jiexiExcel(){
		HttpServletRequest t = this.getRequest();
		String lujing = t.getParameter("lujing");
		System.out.println(lujing);
		//poiXlsxService.jiexiXlsx(filepath);
		return SUCCESS;
	}
	/*public static void main(String[] args) {
		PoiExcelAction poiExcelAction  =  new PoiExcelAction();
		String filepath = "C:\\Users\\Administrator\\Desktop\\slddspjh.xlsx"; 
		poiExcelAction.jiexiExcel(filepath);
		System.err.println("jieshule...");
	}*/
	/*public PoiXlsxService getPoiXlsxService() {
		return poiXlsxService;
	}
	public void setPoiXlsxService(PoiXlsxService poiXlsxService) {
		this.poiXlsxService = poiXlsxService;
	}*/
	
}
