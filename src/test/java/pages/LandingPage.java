package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import AbstractComponents.AbstractComponent;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends AbstractComponent{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver){
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="a[href='ajaxy_page.html']") WebElement a_ajax;
	@FindBy(css="a[href='web-form.html']") WebElement a_web_form;
	
	
	
	
	
	/**
	 * verifies the page Title with parameter on Index page.
	 * @param title
	 */
	
	public void verifyPageTitle(String title) {
		
		String pgTitle = driver.getTitle();
		Assert.assertEquals(title, pgTitle);
	}
	
	
	
	public void goTo(String url) {
		driver.get(url);
		
	}
	public void goToWebForm() {
		
		a_web_form.click();
		
	}

}
