package org.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngdata1 {
static WebDriver driver;
@Test(dataProvider="regression")
public void test1(String s1,String s2) throws Throwable{
  System.out.println(s1);
  System.out.println(s2);
}
@DataProvider(name="regression")
public Object[][] data(){
	return new Object[][] {{"Kishore","253425"},
		                   {"Ganesh","342534"},
		                   {"Ramesh","253456"}};
	}

}
