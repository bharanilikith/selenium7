package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {


		//Step:1 open the browser
				WebDriver driver=new ChromeDriver();
				
		//Step:2 maxmize the browser
				driver.manage().window().maximize();
				
		//step:3 enter the url
				driver.get("https://demo.actitime.com/login.do");
				
				
		//step:4 enter the valid username
				
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));		
				
				WebElement username = driver.findElement(By.id("username"));
				
		w.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
			

		//step:6 click on login button
	WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));
	w.until(ExpectedConditions.elementToBeClickable(button)).click();	
				
		//step:7 get the title
				String actualtitle = driver.getTitle();
				
		w.until(ExpectedConditions.titleContains(actualtitle));	
				System.out.println(actualtitle);
				
		//step:8 get the current utl
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
		//step:9 verfication
				if(actualtitle.equals("actiTIME - Login")) {
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
