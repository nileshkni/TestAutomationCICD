package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class WebFormPage {
	
	WebDriver driver;
	
	public WebFormPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="a[href='web-form.html']") WebElement a_web_form;
	
	
	
	
	
	/**
	 * verifies the page Title with parameter on Index page.
	 * @param title
	 */
	
	public void verifyPageTitle(String title) {
		
		String pgTitle = driver.getTitle();
		Assert.assertEquals(title, pgTitle);
	}
	
	
	
	public void goTo() {
		a_web_form.click();
		
	}
	

}
