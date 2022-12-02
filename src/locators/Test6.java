package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

//Step:1 open the browser
		WebDriver driver=new ChromeDriver();
		
//Step:2 maxmize the browser
		driver.manage().window().maximize();
		
//Step:3 Navigate the url
		driver.get("https://demo.actitime.com/login.do");

//step:4 enter the valid username
		driver.findElement(By.id("username")).sendKeys("admin");
		
//step:5 enter the valid passsword
		driver.findElement(By.name("pwd")).sendKeys("manager");

//step:6 click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	
//step:7 verification
	String title = driver.getTitle();
	if(title.equals("actiTIME - Login")) {
		System.out.println("Pass:home page is dispalyed");
	}
	else
	{
		System.out.println("Fail:Home page is not dispalyed");
	}

	//driver.close();
}}
