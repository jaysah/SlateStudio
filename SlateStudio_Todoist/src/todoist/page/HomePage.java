package todoist.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage{
	
	AndroidDriver<AndroidElement> driver;
	
	public HomePage(AndroidDriver<AndroidElement> _driver)
	{		
		this.driver = _driver;
		PageFactory.initElements(this.driver, this);
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