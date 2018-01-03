package com.boss.demo.service.impl;

import com.boss.demo.service.PoiXlsxService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//@Service("PoiXlsxService")
//@Transactional(readOnly=true)
public class PoiXlsxServiceImpl implements PoiXlsxService {
	private Logger logger = Logger.getLogger(PoiXlsxServiceImpl.class);  
    private Workbook wb;  
    private Sheet sheet;  
    private Row row;
    public PoiXlsxServiceImpl(String filepath) {  
        if(filepath==null){  
            return;  
        }  
        String ext = filepath.substring(filepath.lastIndexOf("."));  
        try {  
            InputStream is = new FileInputStream(filepath);  
            if(".xls".equals(ext)){  
                wb = new HSSFWorkbook(is);  
            }else if(".xlsx".equals(ext)){  
                wb = new XSSFWorkbook(is);  
            }else{  
                wb=null;  
            }  
        } catch (FileNotFoundException e) {  
            logger.error("FileNotFoundException", e);  
        } catch (IOException e) {  
            logger.error("IOException", e);  
        }  
    }  
    public String jiexiXlsx(String filepath){
        PoiXlsxServiceImpl poiXlsxImpl = new PoiXlsxServiceImpl(filepath);
        
        try{
        Map<Integer, Map<Integer,Object>> map = poiXlsxImpl.readExcelContent();  
        System.out.println("���Excel��������:");
        String[] a = poiXlsxImpl.readExcelTitle();
        for(int k =0;k<a.length;k++){
        	System.out.print(a[k].toString()+"||");
        }
        System.out.println();
        for (int i = 1; i <= map.size(); i++) {
        	for (int j = 0; j < map.get(i).size(); j++) {
        		System.out.print(map.get(i).get(j));
			}
        	System.out.println();	
        }
	    } catch (FileNotFoundException e) {  
	        System.out.println("δ�ҵ�ָ��·�����ļ�!");  
	        e.printStackTrace();  
	    }catch (Exception e) {  
	        e.printStackTrace();  
	    }
		return filepath;  
    	
    	
    }
    /** 
     * ��ȡExcel����ͷ������ 
     *  
     * @param InputStream 
     * @return String ��ͷ���ݵ����� 
     * @author zengwendong 
     */  
    public String[] readExcelTitle() throws Exception{  
        if(wb==null){  
            throw new Exception("Workbook����Ϊ�գ�");  
        }  
        sheet = wb.getSheetAt(0);  
        row = sheet.getRow(0);  
        // ����������  
        int colNum = row.getPhysicalNumberOfCells();    
        String[] title = new String[colNum];  
        for (int i = 0; i < colNum; i++) {  
            // title[i] = getStringCellValue(row.getCell((short) i));  
            title[i] = getCellFormatValue(row.getCell(i)).toString();  
        }  
        return title;  
    }  
  
    /** 
     * ��ȡExcel�������� 
     * @param InputStream 
     * @return Map ������Ԫ���������ݵ�Map���� 
     */  
    public Map<Integer, Map<Integer,Object>> readExcelContent() throws Exception{  
        if(wb==null){  
            throw new Exception("Workbook����Ϊ�գ�");  
        }  
        Map<Integer, Map<Integer,Object>> content = new HashMap<Integer, Map<Integer,Object>>();  
        sheet = wb.getSheetAt(0);  
        // �õ�������  
        int rowNum = sheet.getLastRowNum();  
        row = sheet.getRow(0);  
        int colNum = row.getPhysicalNumberOfCells();  
        // ��������Ӧ�ôӵڶ��п�ʼ,��һ��Ϊ��ͷ�ı���  
        for (int i = 1; i <= rowNum; i++) {  
            row = sheet.getRow(i);  
            int j = 0;  
            Map<Integer,Object> cellValue = new HashMap<Integer, Object>();  
            while (j < colNum) {  
                Object obj = getCellFormatValue(row.getCell(j));  
                cellValue.put(j, obj);  
                j++;  
            }  
            content.put(i, cellValue);  
        }  
        return content;  
    }  
  
    /** 
     * ����Cell������������ 
     * @param cell 
     * @return 
     */  
    @SuppressWarnings("deprecation")
	private Object getCellFormatValue(Cell cell) {  
        Object cellvalue = "";  
        if (cell != null) {  
            // �жϵ�ǰCell��Type  
            switch (cell.getCellType()) {  
            case Cell.CELL_TYPE_NUMERIC:// �����ǰCell��TypeΪNUMERIC  
            case Cell.CELL_TYPE_FORMULA: {  
                // �жϵ�ǰ��cell�Ƿ�ΪDate  
                if (DateUtil.isCellDateFormatted(cell)) {  
                    // �����Date������ת��ΪData��ʽ  
                    // data��ʽ�Ǵ�ʱ����ģ�2013-7-10 0:00:00  
                    // cellvalue = cell.getDateCellValue().toLocaleString();  
                    // data��ʽ�ǲ�����ʱ����ģ�2013-7-10  
                    String date = cell.getDateCellValue().toLocaleString();  
                    cellvalue = date;  
                } else {// ����Ǵ�����  
                    // ȡ�õ�ǰCell����ֵ  
                    cellvalue = String.valueOf(cell.getNumericCellValue());  
                }  
                break;  
            }  
            case Cell.CELL_TYPE_STRING:// �����ǰCell��TypeΪSTRING  
                // ȡ�õ�ǰ��Cell�ַ���  
                cellvalue = cell.getRichStringCellValue().getString();  
                break;  
            default:// Ĭ�ϵ�Cellֵ  
                cellvalue = "";  
            }  
        } else {  
            cellvalue = "";  
        }  
        return cellvalue;  
    }  
}
