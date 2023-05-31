package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void BFClass() {
		System.out.println("I (BeforeClass) will execute before the class");
	}
	
	@AfterClass
	public void AfClass() {
		System.out.println("I (AfterClass) will execute after the class");
	}
	//@Parameters({"URL","APIKey/Username"})
	@Test
	//public void WebLoginCarLoan(String uname, String apikey) {
		public void WebLoginCarLoan() {
		//Selenium
		System.out.println("WebLogin Car Loan");
		//System.out.println(uname);
		//System.out.println(apikey);
	}
	
	@Test
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("MobileLogin Car");
	}
	@Test(groups= {"Smoke"})
	public void MobileSigninCarLoan() {
		//Appium
		System.out.println("MobileSignIn Car");
	}
	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username, String password) {
		//Appium
		System.out.println("MobileSignOut Car");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeMethod
	public void BeMethod() {
	 System.out.println("I will execute before each & every Method/Test in the class");
	}
	
	@AfterMethod
	public void AfeMethod() {
	 System.out.println("I will execute after each & every Method/Test in the class");
	}
	
	
	@Test(dependsOnMethods={"MobileSignoutCarLoan","WebLoginCarLoan"})
	public void APICarLoan() {
		//Rest API Automation
		System.out.println("API CarLoan");
	}
	
	@DataProvider
	public Object[][] getData(){
		//1st Combination : username & password : Customers with Good cresit History
		//2nd Combination : username & password : No credit History
		//3rd Combination : username & password : Fradulent credit History
		
		Object [][] data =new Object[3][2];
		//3 : No. of Rows & 2 : No. of Columns
		
		//1st Set
		data[0][0]="First Username";
		data[0][1]="First Password";
		//2nd Set
		data[1][0]="Second Username";
		data[1][1]="Second Password";
		//3rd Set
		data[2][0]="Third Username";
		data[2][1]="Third Password";
		return data;
		
	}
	

}
