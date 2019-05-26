package TestSlateStudio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import todoist.page.HomePage;
import todoist.page.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.junit.Assert.*;

public class CheckProject_Exists {

	public AndroidDriver<AndroidElement> driver;
	HomePage home;
	LoginPage login;
	
	 @Before
	  public void setUp() throws MalformedURLException, InterruptedException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    //desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\Todoist_v12.8_apkpure.com.apk");
	    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("appActivity", "com.todoist.activity.HomeActivity");
	    desiredCapabilities.setCapability("appPackage", "com.todoist");
	    //desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("noReset", true);	   
	    
		
		URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(remoteUrl, desiredCapabilities);		
	 }

	  @Test
	  public void testCase() throws InterruptedException {
		Thread.sleep(5000);
		  //Goto home page and click Continue With Email Button
		  home = new HomePage(driver);
		  login = home.ClickBtnContinueWithEmail();
		  		 
		  login.txtUserId.setValue("info.jsframes@gmail.com");		 
		  login.btnContinueWithEmail.click();
		  driver.wait(5000);
		  login.txtPassword.setValue("Login@gmail~1");
	  }

	  @After
	  public void tearDown() {
	   driver.quit();
	  }
}
