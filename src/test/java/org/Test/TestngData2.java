package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngData2 extends Testdata2{
	static WebDriver driver;
	@Test(dataProvider="regression")
	public void test1(String s1,String s2) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Newmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		
	}
	@DataProvider(name="regression")
	public Object[][] data() throws Throwable{
		return getdata();
		}

}
