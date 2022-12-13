package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		
		
		driver.findElement(By.id("departure")).click();
		
		
		driver.findElement(By.xpath("//p[text()='25']")).click();
		
		
	}

}
