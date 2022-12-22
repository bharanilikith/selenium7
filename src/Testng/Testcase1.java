package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	public WebDriver  driver;
	@BeforeMethod
	public void openApp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void tc1() {
	driver.findElement(By.id("email")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("manager");
    driver.findElement(By.name("login")).click();
   String title = driver.getTitle();
   //syntax
  // Assert.assertEquals(actual,Expected);
   
   //example
 //  Assert.assertEquals(title,"543erteretr");
   
   //syntax
//   SoftAssert s=new SoftAssert();
//   s.assertEquals(actual,Expected);
   
   //example
   SoftAssert s=new SoftAssert();
   s.assertEquals(title,"Log in to Facebook");
   
    Reporter.log(title,true);
    String url = driver.getCurrentUrl();
    Reporter.log(url,true);
    s.assertAll();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
