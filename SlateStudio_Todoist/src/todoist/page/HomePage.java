package todoist.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage{
	
	public HomePage(AndroidDriver<AndroidElement> driver)
	{		
		PageFactory.initElements(driver, this);
	}
		
	@CacheLookup
	@AndroidFindBy(id="")
	private MobileElement btnContinueWithGoogle;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_google")
	private MobileElement btnContinueWithFacebook;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_facebook")
	private MobileElement txtPassword;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_welcome_continue_with_email")
	private MobileElement btnContinueWithEmail;
		
}