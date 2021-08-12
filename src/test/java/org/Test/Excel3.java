package org.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel3 {
public static void main(String[] args) throws Exception {
	
	File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\src\\test\\resources\\NewExcel.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s =w.createSheet("write");
	
	Row r =s.createRow(0);
	Cell c=r.createCell(0);
	
	c.setCellValue("Start");
	
	FileOutputStream f1=new FileOutputStream(f);
	w.write(f1);
}

}
