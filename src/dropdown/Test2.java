package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Sept_Batches/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dd = driver.findElement(By.id("MTR"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		s.selectByValue("i");
		s.selectByVisibleText("vada");
		
		//deselection
		
		Thread.sleep(2000);
		s.deselectByIndex(2);
		
		Thread.sleep(2000);
		s.deselectByValue("i");
		
		Thread.sleep(2000);
		s.deselectByVisibleText("vada");
		
	}

}
