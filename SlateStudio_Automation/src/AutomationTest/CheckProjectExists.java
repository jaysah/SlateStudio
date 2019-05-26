package AutomationTest;

import static org.junit.Assert.*;

import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckProjectExists {

	public AndroidDriver<WebElement> driver;
	//Pages.HomePage home;
	Pages.LoginPage login;
	
	@Before
	public void setUp() throws Exception {
		 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		  //desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\Todoist_v12.8_apkpure.com.apk");
		  desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  desiredCapabilities.setCapability("platformName", "android");
		  desiredCapabilities.setCapability("appActivity", "com.todoist.activity.HomeActivity");
		  desiredCapabilities.setCapability("appPackage", "com.todoist");
		  desiredCapabilities.setCapability("noReset", true);	   		    
			
		  URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		  driver = new AndroidDriver<WebElement>(remoteUrl, desiredCapabilities);	
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		 Thread.sleep(5000);
		//Goto home page and click Continue With Email Button
		//WebElement btn = driver.findElementById("com.todoist:id/btn_welcome_continue_with_email");	
		//btn.click();
		//Thread.sleep(5000);
		Pages.HomePage home = new Pages.HomePage(this.driver);
		 login = home.ClickBtnContinueWithEmail();
		  		 
		  login.txtUserId.setValue("info.jsframes@gmail.com");		 
		  login.btnContinueWithEmail.click();
		  driver.wait(5000);
		  login.txtPassword.setValue("Login@gmail~1");
	}
}
