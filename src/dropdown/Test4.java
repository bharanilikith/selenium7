package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	WebElement dd = driver.findElement(By.id("month"));
	Select s=new Select(dd);
	s.selectByIndex(0);
	s.selectByValue("3");
	s.selectByVisibleText("May");
	
	//count the option
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());
	
	ArrayList a=new ArrayList();
	
	//to print the text
	for(WebElement b:alloptions) {
		String text = b.getText();
		System.out.println(text);
		a.add(text);
	}
	
	System.out.println(s.isMultiple());
	
	System.out.println("**************after sorting**************");
	
	Collections.sort(a);
	
	for(Object opt:a) {
		System.out.println(opt);
	}
	
	driver.close();
	
	
	}

}
