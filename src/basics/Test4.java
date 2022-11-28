package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {

WebDriver driver=new FirefoxDriver();
driver.get("https://www.myntra.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

driver.close();



	}

}
