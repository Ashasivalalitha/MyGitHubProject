package listenerPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLearning implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
	
		//System.out.println("This test case is failed: "+result.getName()); //gives the method name
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\asha_\\OneDrive\\Documents\\Selenium\\Software\\Screenshot_1.jpg\" target=\"blank\"> Screenshot link <a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\asha_\\OneDrive\\Documents\\Selenium\\Software\\Screenshot_1.jpg\" target=\"blank\"> <img height=200 width=200 src =\"C:\\Users\\asha_\\OneDrive\\Documents\\Selenium\\Software\\Screenshot_1.jpg\"> <a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This test case is skipped: "+result.getName());
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println();
	System.out.println("Test starts : "+result.getName());
	}
}
