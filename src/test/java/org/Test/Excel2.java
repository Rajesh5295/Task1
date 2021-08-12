package org.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
public static void main(String[] args) throws Exception {
	
	File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\src\\test\\resources\\Book2.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f1);
	Sheet s=w.getSheet("sheet2 ");
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r=s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c=r.getCell(j);
			int celltype=c.getCellType();
			if (celltype==1) {
				String name=c.getStringCellValue();
				System.out.println(name);
			}
			if (celltype==0) {
				if (DateUtil.isCellDateFormatted(c)) {
				Date d=c.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy");
				String name=sd.format(d);
				System.out.println(name);
				}
				else {
					double d=c.getNumericCellValue();
					long l=(long)d;
					String name=String.valueOf(l);
					System.out.println(name);
				}
			}
		}
	}
}
}
