package z_seleniumproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabAndWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		String parentWindow = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.mail.yahoo.com");
		System.out.println("Window 1: "+driver.getTitle());


		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.gmail.com");
		System.out.println("Window 2: "+driver.getTitle());
		
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		System.out.println("Window home: "+driver.getTitle());
		
	}

}
