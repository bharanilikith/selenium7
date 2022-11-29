package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[id='password']")).sendKeys("manager")	;
	}

}
