package dataParameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest_Parameterization {
	
public WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}

		return driver;
	}
	

	public void tearDown() {
		
		System.out.println("Test ends...!!");

	}

}
