package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test4 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hdfcbank.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//to get parent browser address
String parent = driver.getWindowHandle();
System.out.println(parent);



//case:1 handle this
driver.switchTo().newWindow(WindowType.TAB);
driver.navigate().to("https://paytm.com/");

//to get address of parent and child browser
Set<String> child = driver.getWindowHandles();
System.out.println(child);


driver.quit();
	}

}
