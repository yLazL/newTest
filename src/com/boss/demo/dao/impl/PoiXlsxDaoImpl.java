package com.boss.demo.dao.impl;

import com.boss.demo.dao.PoiXlsx;
import com.boss.demo.service.PoiXlsxService;

public class PoiXlsxDaoImpl implements PoiXlsx {
	private PoiXlsxService poiXlsxService;
	public void jiexiXlsx(String path) {
		poiXlsxService.jiexiXlsx(path);
	}

}
