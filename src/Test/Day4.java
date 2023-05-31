package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I (After Test) will execute Last");
	}
	
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname) {
		//Selenium
		System.out.println("WebLogin Personal Home Loan");
		System.out.println(urlname);
	}
	
	@Test(enabled=false)
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLogin Home");
	}
	
	@Test(groups= {"Smoke"})
	public void APIHomeLoan() {
		//Rest API Automation
		System.out.println("API Home");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I (Before Test) will execute First");
	}
	

}
