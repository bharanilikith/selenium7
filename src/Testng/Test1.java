package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo() {
	Reporter.log("Hello Java",true);
	Reporter.log("Hello Selenium",false);
	}

}
