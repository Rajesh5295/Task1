/*package org.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
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

public class Flipcopy {
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
		List<WebElement> mob=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<String> Strings=new ArrayList<String>();
		for (WebElement i : mob) {
			Strings.add(i.getText());
			System.out.println(Strings);
		}
		


		File f=new File("C:\\Users\\user\\eclipse-workspace\\Newmaven\\src\\test\\task\\Task3.xlsx");

		Workbook W=new XSSFWorkbook();
		Sheet s=W.createSheet("Sheet1");
		
	List<String> New=Arrays.asList(Strings	);
		
		for (int j = 0; j <Strings.size(); j++) {
		
			
				
				Row r1=s.createRow(j);
				Cell c1=r1.createCell(0);
				c1.setCellValue(Strings);
			}
			
				
				
				
				
			}
					
		
						
		FileOutputStream f1=new FileOutputStream(f);
		W.write(f1);


		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();

		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(child);
		for (String x : child) {
			if(!parent.equals(child)) {
				driver.switchTo().window(x);			
			}
		}
//		String s25=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
//		System.out.println("\r\n"+"3rd value in website:"+s25);

		FileInputStream f2=new FileInputStream(f);
//		Row r=s.getRow(2);
//		Cell c=r.getCell(0);
//		int celltype =c.getCellType();
//		if (celltype==1 || celltype==0) {
//			String value=c.getStringCellValue();
//			System.out.println("3rd value in Excel:"+value);
//			if (value.equals(s25)) {
//				c.setCellValue("Both are equal");
//			}
//			else {
//				System.out.println("Both Are Not equal");
//			}

		}}


*/