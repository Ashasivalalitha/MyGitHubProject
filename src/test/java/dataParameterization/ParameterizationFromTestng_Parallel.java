package dataParameterization;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationFromTestng_Parallel extends BaseTest_Parameterization {

	@Parameters({"browser"})
	@Test
	public void launch(String browser) throws InterruptedException {
		driver = launchBrowser(browser);
		System.out.println("Browser is : "+browser+" - "+new Date());
		driver.get("http://www.mail.yahoo.com");
		System.out.println("Title is : "+driver.getTitle());

	}

}
