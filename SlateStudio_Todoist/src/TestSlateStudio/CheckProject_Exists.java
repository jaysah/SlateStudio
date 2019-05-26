package TestSlateStudio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.junit.Assert.*;

public class CheckProject_Exists {

	public AndroidDriver<AndroidElement> driver;
	
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
			    Thread.sleep(5000);
	 }

	  @Test
	  public void test() {
		
		  assertNotNull(driver.getContext());
		  MobileElement el1 = (MobileElement) driver.findElementById("com.todoist:id/btn_welcome_continue_with_email");
		    el1.click();
		    MobileElement el2 = (MobileElement) driver.findElementById("com.todoist:id/email_exists_input");
		    el2.sendKeys("info.jsframes@gmail.com");
		    MobileElement el3 = (MobileElement) driver.findElementById("com.todoist:id/btn_continue_with_email");
		    el3.click();
		    MobileElement el4 = (MobileElement) driver.findElementById("com.todoist:id/log_in_password");
		    el4.sendKeys("bed542air626");
		    MobileElement el5 = (MobileElement) driver.findElementById("com.todoist:id/btn_log_in");
		    el5.click();
		
	  }

	  @After
	  public void tearDown() {
	   // driver.quit();
	  }
}
