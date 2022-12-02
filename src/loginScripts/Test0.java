package loginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

//Step:1 open the browser
		WebDriver driver=new ChromeDriver();
		
//Step:2 maxmize the browser
		driver.manage().window().maximize();
		
//step:3 enter the url
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
//step:4 enter the valid username
		driver.findElement(By.id("username")).sendKeys("admin");

		Thread.sleep(3000);
//step:5 enter the valid password
		driver.findElement(By.name("pwd")).sendKeys("maanger");

		Thread.sleep(3000);
//step:6 click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
//step:7 get the title
		String title = driver.getTitle();
		System.out.println(title);
		
//step:8 get the current utl
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//step:9 verfication
		if(title.equals("actiTIME - Login")) {
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		

//step:10 close the application
		driver.close();

	}

}
