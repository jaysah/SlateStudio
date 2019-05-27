package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AutomationTest.CheckProjectExists;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage{
	
	AppiumDriver<WebElement> driver;
	
	public HomePage(AppiumDriver<WebElement> driver)
	{		
		this.driver = driver;		
		PageFactory.initElements(this.driver, this);		
	}
		
	@FindBy(id="com.todoist:id/btn_google") WebElement
	btnContinueWithGoogle;	 
	
	@FindBy(id="com.todoist:id/btn_facebook") WebElement
	btnContinueWithFacebook;
	
	@FindBy(id="com.todoist:id/btn_welcome_continue_with_email") WebElement 
	btnContinueWithEmail;
		
	@FindBy(id="com.google.android.gms:id/suc_layout_title") WebElement
	CheckingInfo;
	
	//btnContinueWithEmail
	@FindBy(id="candroid:id/body") WebElement
	PleaseWaitSplashScreen;
	
	public LoginPage ClickBtnContinueWithGoogle() throws InterruptedException
	{
		btnContinueWithGoogle.click();
		
		return new LoginPage(this.driver);		
	}
	
	public LoginPage ClickBtnContinueWithEmail() throws InterruptedException
	{
		btnContinueWithEmail.click();		
		
		return new LoginPage(this.driver);		
	}	
}