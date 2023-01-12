package z_seleniumproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RelativeLocatorProgram {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kayak.com/flights/DFW-LAS/2022-12-30/2023-01-06?sort=price_a");
//		driver.findElement(By.xpath("//span[contains(text(),'Best')]")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//span[contains(text(),'Best')]")).click();
		
		
		//works
		driver.findElement(RelativeLocator.with(By.xpath("//span[contains(text(),'Best')]")).
				toRightOf(By.xpath("//span[contains(text(),'Cheapest')]"))).click();
		
		
		
	}

}
