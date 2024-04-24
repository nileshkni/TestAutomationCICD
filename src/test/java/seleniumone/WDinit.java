package seleniumone;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.WebFormPage;
import pages.Driver;

public class WDinit {

	WebDriver driver;
	String baseUrl;

	// RemoteWebDriver driver;
	@BeforeClass
	@Parameters({ "browser","URL"})
	void initTest(String browser, String url) throws MalformedURLException {
		/*
		 * ChromeOptions options=new ChromeOptions(); options.addArguments("headless");
		 * options.setBinary("/usr/bin/google-chrome-stable"); driver = new
		 * ChromeDriver(options); driver = new ChromeDriver();
		 */
		
		/*
		 * URL url = new URL("http://localhost:4444");
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless=new"); driver = new RemoteWebDriver(url,
		 * options);
		 */
		baseUrl = url;
		driver = Driver.get(browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@Test
	void testOne() {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo(baseUrl);
		landingPage.verifyPageTitle("Index of Available Pages");
		
		WebFormPage webFormPage = new WebFormPage(driver);
		webFormPage.goTo();
		webFormPage.verifyPageTitle("Web form");

	}

	@AfterClass
	void closeAll() {
		driver.quit();
	}

}
