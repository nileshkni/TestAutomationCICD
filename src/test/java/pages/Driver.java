package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static WebDriver get(String browser) {
		if (driver.get() == null) {

			switch (browser.toLowerCase()) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver.set(new ChromeDriver());
				break;

			}

			
		}

		return driver.get();
	}
	
	public static void close() {
		driver.get().close();
	}

	public static void quit() {
		driver.get().quit();
		driver.set(null);
	}

}
