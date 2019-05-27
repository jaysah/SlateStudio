package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Task {
	AppiumDriver<WebElement> driver;
	
	public Task(AppiumDriver<WebElement> _driver)
	{	
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.todoist:id/email_exists_input")
	WebElement txtUserId;

}