package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	WebDriver driver;	
	
	public void invokeBrowser() {
				
		String chromeDriverPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath); 
		
		driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	} 
	
	
	public static void main(String[] args) {
		
		SeleniumTest testDriver = new SeleniumTest();
		
		testDriver.invokeBrowser(); 
		
		//testDriver.testFacebook();
		
		//driver.get("http://google.com");
	}

	public void testFacebook() { 
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Username1");
		driver.findElement(By.id("pass")).sendKeys("Password1"); 
		driver.findElement(By.id("loginbutton")).submit(); 
			
	} 
	
}
