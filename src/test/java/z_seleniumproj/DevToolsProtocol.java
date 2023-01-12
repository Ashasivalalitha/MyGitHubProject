package z_seleniumproj;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v107.emulation.Emulation;
import org.openqa.selenium.devtools.v107.security.Security;

public class DevToolsProtocol {

	public static void main(String[] args) {


		WebDriver driver;
		
		
		
		
		driver = new ChromeDriver();

		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
	
		
//ssl certificate
/*
		devTools.send(Security.enable());
		devTools.send(Security.setIgnoreCertificateErrors(true));	
		driver.get("https://expired.badssl.com");
*/

//geo location	
/*

		devTools.send(Emulation.setGeolocationOverride(Optional.of((Number)51), 
				Optional.of((Number)(double)-0.118092), Optional.of((Number)100)));
		driver.get("https://mycurrentlocation.net/");
*/
		
		
//dev view
		

		/*
		 * devTools.send(Emulation.setDeviceMetricsOverride(375, 812, 50, true,
		 * Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
		 * Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
		 * Optional.empty()));
		 * 
		 */
/*		Map<String, Object> deviceMetrics = new HashMap<String, Object>() {
 
			{
 
				put("width", 375);
				put("height", 812);
				put("mobile", true);
				put("deviceScaleFactor", 50);
			}
 
		};
 
		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver.get("https://selenium.dev/");
*/
		
		
		
//network request
/*
 
 
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg",".png","*.jpeg")));
		
		driver.get("http://makemytrip.com");
 
 
 */
		
		
		
//running test on slow network
/*

devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.emulateNetworkConditions(false, 100, 20000, 10000, Optional.of(ConnectionType.CELLULAR4G)));
		
		driver.get("http://way2automation.com");


 */
		
	
// override timezone
/*
  devTools.send(Emulation.setTimezoneOverride("EST"));
		driver.get("https://whatismytimezone.com/");
 */
		
		
		
// console logs
		
/*

devTools.send(Log.enable());
		devTools.send(Console.enable());
		
		devTools.addListener(Log.entryAdded(), entry ->{
 
			
			System.out.println("Text is : "+entry.getText());
			System.out.println("TimeStamp is : "+entry.getTimestamp());
			System.out.println("Source is : "+entry.getSource());
			System.out.println("Level is : "+entry.getLevel());
			
			
			
		});
		
		
		devTools.addListener(Console.messageAdded(), message ->{
 
			
			System.out.println("Console Text is : "+message.getText());
 
			
			
			
		});
		
		driver.get("http://flipkart.com");
		
		((JavascriptExecutor) driver).executeScript("console.log('This is a sample log')");
 
 */
		
		
		
// Capturing Request and Response Headers
/*
devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
 
		devTools.addListener(Network.requestWillBeSent(), request -> {
 
			Headers header = request.getRequest().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Request Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
 
		});
 
		devTools.addListener(Network.responseReceived(), response -> {
 
			Headers header = response.getResponse().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Response Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
			
 
			
		});
		
 
		
		driver.get("https://flipkart.com");
 
*/	
		
		
// Get URL and Status for each request and response
/*
devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
 
		devTools.addListener(Network.requestWillBeSent(), request -> {
 
			Headers header = request.getRequest().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Request Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
 
		});
 
		devTools.addListener(Network.responseReceived(), response -> {
 
			Headers header = response.getResponse().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Response Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
			
			System.out.println("Response URL is : "+response.getResponse().getUrl()+"  status code is : "+response.getResponse().getStatus());
			
			
		});
		
	
		
		driver.get("https://flipkart.com");
*/	
		
// Adding Custom headers
/*
devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
 
		devTools.addListener(Network.requestWillBeSent(), request -> {
 
			Headers header = request.getRequest().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Request Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
 
		});
 
		devTools.addListener(Network.responseReceived(), response -> {
 
			Headers header = response.getResponse().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Response Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
			
			System.out.println("Response URL is : "+response.getResponse().getUrl()+"  status code is : "+response.getResponse().getStatus());
			
			
		});
		
		Map<String, Object> headers = new HashMap<String,Object>();
		headers.put("customHeaderName", "customHeaderValue");
		headers.put("Rahul", "Automation Tester");
		Headers head = new Headers(headers);
		devTools.send(Network.setExtraHTTPHeaders(head));
		
		driver.get("https://flipkart.com");
 
*/	
		
		
// Changing the browser User Agent 
/*
String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36";
		
		devTools.send(Network.setUserAgentOverride(userAgent, Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://www.whatismybrowser.com/detect/what-is-my-user-agent");
*/	
		
		
// Enable Performance Metrics 
/*
devTools.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));
		
		driver.get("http://google.com");
		
		
		List<Metric> metrics = devTools.send(Performance.getMetrics());
		
		metrics.forEach(metric ->System.out.println(metric.getName()+" : "+metric.getValue()));
*/	
		
		
		
	}

}
