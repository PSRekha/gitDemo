package Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void Demo2() {
		System.out.println("Good!");
	}
	
	@AfterSuite
	public void AfSuite() {
		System.out.println("I (After Suite) will execute No.1 at Last");
	}

}
