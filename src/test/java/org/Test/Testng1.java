package org.Test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng1 {
     static WebDriver driver;
	 
	 @Test(groups="regression")
	 public void Test1() {
		 System.out.println("pass");
	 }
	 @Test
	 public void Test2() {
		 System.out.println("Fail");
	 }
	 @Test(groups="regression")
	 public void Test3() {
		 System.out.println("pass");
	 }
	 @Test
	 public void Test4() {
		 System.out.println("Fail");
	 }
	 @Test(groups="regression")
	 public void Test5() {
		 System.out.println("pass");
	 }
	 @Test
	 public void Test6() {
		 System.out.println("Fail");
	 }
	 
	 
}
