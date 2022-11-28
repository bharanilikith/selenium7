package windowMangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		//mazmize the browser
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
		Thread.sleep(5000);
		
		//full screen
		driver.manage().window().fullscreen();
		
		Thread.sleep(5000);
		
		//minimize the browser
		driver.manage().window().minimize();
		
		
		

	}

}
