package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");

Thread.sleep(3000);

driver.navigate().to("https://skillrary.com/");


//back
driver.navigate().back();

Thread.sleep(3000);

//forword
driver.navigate().forward();

Thread.sleep(3000);

//refresh
driver.navigate().refresh();




	}

}
