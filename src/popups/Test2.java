package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.id("login-btn")).click();
WebElement ele = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
ele.click();
ele.sendKeys("5325676thfgtyj");
	}

}
