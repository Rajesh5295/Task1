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

public class Testdata2 {
	static String value;
	public static Object[][] getdata() throws Throwable {
		File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\src\\test\\resources\\Book1.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("sheet1");
		Row row=s.getRow(0);
		Object[][] obj=new Object[s.getPhysicalNumberOfRows()][row.getPhysicalNumberOfCells()];

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c =r.getCell(j);
				int cell=c.getCellType();
				if (cell==1) {
					value=c.getStringCellValue();
				}
				else if (cell==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						Date d=c.getDateCellValue();
						SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy");
						value=sd.format(d);
					}
					else {
						double d=c.getNumericCellValue();
						long l=(long)d;
						value=String.valueOf(l);
					}	
				}
				obj[i][j]=value;
			}	

		}
		return obj;

	}
}
