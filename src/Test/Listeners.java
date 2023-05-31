package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//We need to implement ITest Listeners , it is an interface which implements TestNG Listeners
public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("I successfully executed Listeners Pass Code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//Screenshot code
		//Response if API is failed
		//Here we are printing failed Test case name using getName() method
		System.out.println("I executed Listener when Test is failed! "+result.getName());
		
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	
}
