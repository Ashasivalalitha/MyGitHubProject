package z_seleniumproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsernameAndPassword {

	public static void main(String[] args) {

			

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		/*
		 
		//the usual
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Car");
		driver.findElement(By.xpath("//input[@name='wpName']")).sendKeys("Ashasivalalitha");
		driver.findElement(By.xpath("//input[@name='wpPassword']")).sendKeys("!1Qwertyasha");
		driver.findElement(By.xpath("//button[@name='wploginattempt']")).click();
		
		 */
		
		
		//Giving credential in the url
		//did not work
		//driver.get("https://Ashasivalalitha:!1Qwertyasha@en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Car");
		
		
		//did not work
		((HasAuthentication) driver).register(UsernameAndPassword.of("Ashasivalalitha", "!1Qwertyasha"));
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Car");
		
	}

}
