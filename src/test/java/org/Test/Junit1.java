package org.Test;

import java.util.Date;
import java.util.List;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit1 {
	static WebDriver driver;
	@AfterClass
	public static void quit(){
		driver.quit();
	}

	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Newmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();

	}
	@Before
	public void start() {
		Date d =new Date();
		System.out.println("Start"+d);
	}
	@After
	public void end() {
		Date d=new Date();
		System.out.println("End"+d);
	}
	@Test
	public void test1(){
		Assert.assertTrue(driver.getCurrentUrl().contains("https"));
		Assert.assertTrue(driver.getTitle().contains("Face"));
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("Yousaf@yahoo.com");

	}
	@Ignore
	@Test
	public void test2(){

		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("Yousaf");
		Assert.assertEquals(pass.getAttribute("value"),"Yousaf");
		driver.findElement(By.xpath("//button[@type='submit']"));
	}
	@Test
	public void test3(){

		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("Yousaf");
		Assert.assertEquals(pass.getAttribute("value"),"Yousaf");
		driver.findElement(By.xpath("//button[@type='submit']"));
	}
}
