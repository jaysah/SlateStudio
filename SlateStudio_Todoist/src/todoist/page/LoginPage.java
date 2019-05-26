package todoist.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage{
	
	public LoginPage(AndroidDriver<AndroidElement> driver)
	{		
		PageFactory.initElements(driver, this);
	}
	
	String userid = "info.jsframes@gmail.com";
	String password = "Login@gmail~1";
		
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/email_exists_input")
	private MobileElement txtUserId;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_continue_with_email")
	private MobileElement btnContinueWithEmail;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/log_in_password")
	private MobileElement txtPassword;
	
	@CacheLookup
	@AndroidFindBy(id="com.todoist:id/btn_log_in")
	private MobileElement btnLogin;
		
}