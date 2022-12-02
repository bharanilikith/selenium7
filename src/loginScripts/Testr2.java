package loginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testr2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("154ertet");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("65rfyt6yh"); 	
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	
	}

}
