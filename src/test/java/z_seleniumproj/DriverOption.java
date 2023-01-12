package z_seleniumproj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverOption {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		Map<String,String> mobileEm = new HashMap<String,String>();
		mobileEm.put("deviceName", "iPhone X");
		
		//options.addArguments("--headless");
		options.addArguments("disable-infobars");
		options.addArguments("window-size=1400,1000");
		options.addArguments("incognito");
		
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("mobileEmulation",mobileEm );
		
		//WebDriver driver =  new ChromeDriver(options);
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.mail.yahoo.com");
		//System.out.println("Window 1: "+driver.getTitle());
		
		//Rectangle class
		WebElement next = driver.findElement(By.linkText("Sign up"));
		
		Rectangle rect = next.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
	}

}
