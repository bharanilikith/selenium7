package loginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("qwerrerrt");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("1243567rsdzxrgt");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[contains(@class,'_ab8w')])[4]")).click();

	
	String acttitle = driver.getTitle();
	if(acttitle.equals("Instagram")) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}

}
