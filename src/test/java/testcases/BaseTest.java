package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("Test begins...!!");

	}
	
	@AfterSuite
	public void tearDown() {
		
		System.out.println("Test ends...!!");

	}

}
