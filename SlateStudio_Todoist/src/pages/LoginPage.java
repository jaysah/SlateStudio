package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage{
	
	public LoginPage(AppiumDriver<WebElement> driver)
	{		
		PageFactory.initElements(driver, this);
	}
	
	String userid = "info.jsframes@gmail.com";
	String password = "Login@gmail~1";
		
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/email_exists_input")
	public MobileElement txtUserId;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_continue_with_email")
	public MobileElement btnContinueWithEmail;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/log_in_password")
	public MobileElement txtPassword;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_log_in")
	public MobileElement btnLogin;
		
}