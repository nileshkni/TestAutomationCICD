package seleniumone;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WDinit {
	
	WebDriver driver;
	@BeforeClass
	void initTest() {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("headless");
		//options.setBinary("/usr/bin/google-chrome-stable");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
	}
	
	
	@Test
	void testOne() throws InterruptedException {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	
	
}
