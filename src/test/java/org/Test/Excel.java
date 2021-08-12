package org.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
public static void main(String[] args) throws Exception {
	
	File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\src\\test\\resources\\Book4.xlsx");
	FileInputStream f2=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f2);
	Sheet s=w.getSheet("sheet1");

	Row r=s.getRow(0);
	Cell c =r.getCell(0);
	 
	int celltype =c.getCellType();
	if (celltype==1) {
		String value=c.getStringCellValue();
		System.out.println(value);
		if (value.equals("start")) {
			c.setCellValue("End");
			FileOutputStream f1=new FileOutputStream(f);
			w.write(f1);
		}
	}
	
	
	
	
	
}
}
