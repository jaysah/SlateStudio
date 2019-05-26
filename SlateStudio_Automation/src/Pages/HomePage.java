package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage{
	
	AndroidDriver<WebElement> driver;
	
	public HomePage(AndroidDriver<WebElement> _driver)
	{		
		driver = _driver;
		AppiumFieldDecorator deco = new AppiumFieldDecorator(_driver);		
		PageFactory.initElements(deco, this);
	}
		
	@AndroidFindBy(id="com.todoist:id/btn_google")
	private MobileElement btnContinueWithGoogle;
	
	@AndroidFindBy(id="com.todoist:id/btn_facebook")
	private MobileElement btnContinueWithFacebook;
		
	@AndroidFindBy(id="com.todoist:id/btn_welcome_continue_with_email")
	private MobileElement btnContinueWithEmail;

	public LoginPage ClickBtnContinueWithEmail() throws InterruptedException
	{
		btnContinueWithEmail.click();
		Thread.sleep(5000);
		return new LoginPage(this.driver);		
	}	
}