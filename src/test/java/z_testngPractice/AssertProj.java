package z_testngPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertProj {
	
	WebDriver driver;
	SoftAssert softAssert;
	
	@Test
	private void learningAssert() {


		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		//Assert.assertEquals("Google", title);
		
		softAssert = new SoftAssert();
		softAssert.assertEquals(title, "Google", "Fail: condition was not met.");
		softAssert.assertAll();
	}
	
	
	
	

}
