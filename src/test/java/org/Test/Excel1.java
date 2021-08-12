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
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class Excel1 {
public static void main(String[] args) throws Exception {
	
	File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\Book3.xlsx");
	
	Workbook w=new XSSFWorkbook();
	Sheet s=w.createSheet("sheet1");
	
	Row r=s.createRow(0);
	Cell c=r.createCell(0);		
	
	c.setCellValue("Tryit");
	
	FileOutputStream f1=new FileOutputStream(f);
	w.write(f1);
	}
}

