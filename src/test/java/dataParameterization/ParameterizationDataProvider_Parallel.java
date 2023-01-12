package dataParameterization;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDataProvider_Parallel extends BaseTest_Parameterization {

	
	@Test(invocationCount = 2, threadPoolSize = 2, dataProvider = "data")
	public void launch(String browser, String env) throws InterruptedException {
		driver = launchBrowser(browser);
		System.out.println("Browser is : "+browser+" - "+new Date());
		System.out.println("Env is : "+env);
		driver.get("http://www.mail.yahoo.com");
		System.out.println("Title is : "+driver.getTitle());
		System.out.println();

	}

	@DataProvider(name = "data")
	public Object[][] testdata() {

		Object[][] data = new Object[2][2];
		data[0][0]= "chrome";
		data[0][1]= "uat";
		data[1][0]= "edge";
		data[1][1]= "qa";
		return data;

	}
}
