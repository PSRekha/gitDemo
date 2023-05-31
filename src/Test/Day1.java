package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test(groups= {"Smoke"})
	public void Demo(){
		System.out.println("Hello");
	}
	
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I (Befor Suite) will execute No.1");
	}
	
	@Test
	public void Demo1() {
		System.out.println("Bye");
		Assert.assertTrue(false);

	}


		

	

}
