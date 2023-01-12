package z_seleniumproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitProgram {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		Actions actions;
		Wait<WebDriver> wait;

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(1))
				  .ignoring(NoSuchElementException.class);
		
/*		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Car");
		driver.findElement(By.xpath("//input[@name='wpName']")).sendKeys("Ashasivalalitha");
		driver.findElement(By.xpath("//input[@name='wpPassword']")).sendKeys("!1Qwertyasha");
		driver.findElement(By.xpath("//input[@name='wploginattempt']")).click();
*/
		driver.get("https://www.kayak.com/flights/DFW-LAS/2022-12-30/2023-01-06?sort=price_a");
		driver.findElement(By.xpath("//span[contains(text(),'Best')]")).click();
		//Thread.sleep(5000);
		for(int i=1; i<=5; i++) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'View Deal')]")))).click();
		    break;
		} catch (Exception e) {
		}
		}
		
		
		
		//actions = new Actions(driver);
		//actions.doubleClick(driver.findElement(By.xpath("//p[text()='Latin/Hispanic']"))).perform();
	}

}
