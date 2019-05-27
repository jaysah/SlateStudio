package AutomationTest;

import static org.junit.Assert.*;

import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.LeftPanel.PanelOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckProjectExists {

	public AppiumDriver<WebElement> driver;
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
		 desiredCapabilities.setCapability("noReset", false);	   		    
			
		 URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		 driver = new AppiumDriver<WebElement>(remoteUrl, desiredCapabilities);	
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		//Goto home page and click Continue With Email Button	
		Pages.HomePage home = new Pages.HomePage(driver);
		
		login = home.ClickBtnContinueWithEmail();		
		login.PerformLogin("info.jsframes@gmail.com", "bed542air626");		
		
		Pages.LeftPanel leftpanel = new Pages.LeftPanel(driver);
		leftpanel.Launch();
		leftpanel.ClickPanelItem(PanelOptions.Projects);
	}
}