package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Sample extends BaseTest {
	
	@Test
	public void sampleMethod() {
		
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Car");
		
		driver.findElement(By.xpath("//input[@name='wpName']"));
		driver.findElement(By.xpath("//input[@name='wpPassword']"));
		driver.findElement(By.xpath("//button[@name='wploginattempt']"));
		
		//homepage
		//a[@rel='discussion']/span[text()='Talk']
		
		//talkpage
		//a[@title='Wheel' and text()='wheels']
		
		driver.quit();
		
	}

}
