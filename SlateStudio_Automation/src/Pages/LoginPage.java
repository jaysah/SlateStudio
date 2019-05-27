package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage{
	
	AppiumDriver<WebElement> driver;
	public LoginPage(AppiumDriver<WebElement> _driver)
	{	
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="com.todoist:id/email_exists_input")
	WebElement txtUserId;	
	
	@FindBy(id="com.todoist:id/btn_continue_with_email")
	WebElement btnContinueWithEmail;	
	
	@FindBy(id="com.todoist:id/log_in_password")
	WebElement txtPassword;
		
	@FindBy(id="com.todoist:id/btn_log_in")
	WebElement btnLogin;
	
	@FindBy(id="com.todoist:id/go_to_login_from_sign_up")
	WebElement btnGotoLogin;
		
	@FindBy(id="candroid:id/body") WebElement
	PleaseWaitSplashScreen;
	
	@FindBy(id="android:id/button1") WebElement
	PopupBtn1;
	
	@FindBy(id="android:id/button2") WebElement
	PopupBtn2;
	
	
	public void EnterEmailId(String email, Boolean clickContinue) throws InterruptedException
	{
		txtUserId.sendKeys(email);
		
		if (clickContinue)
		{
			Thread.sleep(500);
			btnContinueWithEmail.click();
		}		
	}
	
	public void EnterEmailId(String email) throws InterruptedException
	{
		EnterEmailId(email, false);
	}	
	
	public void EnterPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);		
	}
	
	public void PerformLogin(String email, String pwd) throws InterruptedException
	{
		EnterEmailId(email, true);
		Thread.sleep(1000);
		EnterPassword(pwd);		
		btnLogin.click();
		
		//If prompt new version available, dismiss
		try
		{
			Thread.sleep(1000);
			PopupBtn2.click();
		}
		catch (Exception ex) {}
	}	
}