package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test3 {

	public static void main(String[] args) {
		//chrome browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		//firefox browser
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver1=new FirefoxDriver(opt);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
	}

}
