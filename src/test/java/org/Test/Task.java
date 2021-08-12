package org.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Newmaven\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement w=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		w.sendKeys("Redmi mobiles");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(3000);
		String s1=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
		System.out.println(s1);

		String s2=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).getText();
		System.out.println(s2);
		String s3=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).getText();
		System.out.println(s3);
		String s4=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).getText();
		System.out.println(s4);
		String s5=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[5]")).getText();
		System.out.println(s5);
		String s6=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[6]")).getText();
		System.out.println(s6);
		String s7=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[7]")).getText();
		System.out.println(s7);
		String s8=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[8]")).getText();
		System.out.println(s8);
		String s9=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[9]")).getText();
		System.out.println(s9);
		String s10=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[10]")).getText();
		System.out.println(s10);
		String s11=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[11]")).getText();
		System.out.println(s11);
		String s12=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[12]")).getText();
		System.out.println(s12);
		String s13=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[13]")).getText();
		System.out.println(s13);
		String s14=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[14]")).getText();
		System.out.println(s14);
		String s15=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[15]")).getText();
		System.out.println(s15);
		String s16=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[16]")).getText();
		System.out.println(s16);
		String s17=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[17]")).getText();
		System.out.println(s17);
		String s18=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[18]")).getText();
		System.out.println(s18);
		String s19=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[19]")).getText();
		System.out.println(s19);
		String s20=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[20]")).getText();
		System.out.println(s20);
		String s21=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[21]")).getText();
		System.out.println(s21);
		String s22=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[22]")).getText();
		System.out.println(s22);
		String s23=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[23]")).getText();
		System.out.println(s23);
		String s24=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[24]")).getText();
		System.out.println(s24);

		File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\src\\test\\task\\Task2.xlsx");

		Workbook W=new XSSFWorkbook();
		Sheet s=W.createSheet("Sheet1");


		s.createRow(0).createCell(0).setCellValue(s1);
		s.createRow(1).createCell(0).setCellValue(s2);
		s.createRow(2).createCell(0).setCellValue(s3);
		s.createRow(3).createCell(0).setCellValue(s4);
		s.createRow(4).createCell(0).setCellValue(s5);
		s.createRow(5).createCell(0).setCellValue(s6);
		s.createRow(6).createCell(0).setCellValue(s7);
		s.createRow(7).createCell(0).setCellValue(s8);
		s.createRow(8).createCell(0).setCellValue(s9);
		s.createRow(9).createCell(0).setCellValue(s10);
		s.createRow(10).createCell(0).setCellValue(s11);
		s.createRow(11).createCell(0).setCellValue(s12);
		s.createRow(12).createCell(0).setCellValue(s13);
		s.createRow(13).createCell(0).setCellValue(s14);
		s.createRow(14).createCell(0).setCellValue(s15);
		s.createRow(15).createCell(0).setCellValue(s16);
		s.createRow(16).createCell(0).setCellValue(s17);
		s.createRow(17).createCell(0).setCellValue(s18);
		s.createRow(18).createCell(0).setCellValue(s19);
		s.createRow(19).createCell(0).setCellValue(s20);
		s.createRow(20).createCell(0).setCellValue(s21);
		s.createRow(21).createCell(0).setCellValue(s22);
		s.createRow(22).createCell(0).setCellValue(s23);
		s.createRow(23).createCell(0).setCellValue(s24);



		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();

		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(child);
		for (String x : child) {
			if(!parent.equals(child)) {
				driver.switchTo().window(x);			
			}
		}
		String s25=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println("\r\n"+"3rd value in website:"+s25);
				
		FileInputStream f2=new FileInputStream(f);
		Row r=s.getRow(2);
		Cell c=r.getCell(0);
		int celltype =c.getCellType();
		if (celltype==1 || celltype==0) {
			String value=c.getStringCellValue();
			System.out.println("3rd value in Excel:"+value);
			if (value.equals(s25)) {
				c.setCellValue("Both are equal");
			}
			else {
				System.out.println("Both Are Not equal");
			}
			FileOutputStream f1=new FileOutputStream(f);
			W.write(f1);
		}}

}
