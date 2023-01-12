package z_seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorValidation {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.tutorialspoint.com/about/about_careers.htm");      
				WebElement element = driver.findElement(By.xpath("//li[@class='heading' and text()='About Tutorialspoint']"));
				String rgba = element.getCssValue("color");
				String hex = Color.fromString(rgba).asHex();
				System.out.println("Color is :" +rgba);     
				System.out.println("Hex code for color:" +hex);
					
	}

}
