package scrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));

	    Point p = ele.getLocation();
	    int x = p.getX();
	    int y=  p.getY();
	    
	    //typcasting
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy("+x+","+y+")");
	    
	    Thread.sleep(5000);
	    
	   // ele.click();
	    
	    //to perform click using javascriptexecutor
//	    JavascriptExecutor js=(JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].click();",ele);
		
	    
		
	}

}
