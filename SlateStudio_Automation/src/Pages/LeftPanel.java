package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class LeftPanel {

	AppiumDriver<WebElement> driver;
	TouchAction<?> action;
	
	@FindBy(name="Inbox") WebElement
	PanelItem_Inbox;
	
	@FindBy(name="Today") WebElement
	PanelItem_Today;
	
	@FindBy(name="Next 7 Days") WebElement
	PanelItem_Next_7_Days;
	
	@FindBy(name="Projects") WebElement
	PanelItem_Projects;
	
	@FindBy(name="Labels") WebElement
	PanelItem_Labels;
	
	@FindBy(name="Filters") WebElement
	PanelItem_Filters;
	
	@FindBy(name="Settings") WebElement
	PanelItem_Settings;
	
	public LeftPanel(AppiumDriver<WebElement> driver)
	{		
		this.driver = driver;		
		PageFactory.initElements(this.driver, this);		
	}
	
	public enum PanelOptions
	{
		Inbox,
		Today,
		Next_7_Days,
		Projects,
		Labels,
		Filters,
		Settings
	};
	
	public void Launch()
	{	
		action = new TouchAction(driver);
		action.press(PointOption.point(101,183));
		action.moveTo(PointOption.point(70,129));
		action.release();
		action.perform();
			
		driver.performTouchAction(action);		
	}
	
	public void ClickPanelItem(PanelOptions opt)
	{		
		switch (opt) {
		case Inbox:
			PanelItem_Inbox.click();
			break;		
		case Today:
			PanelItem_Today.click();
			break;
		case Next_7_Days:
			PanelItem_Next_7_Days.click();
			break;
		case Projects:
			PanelItem_Projects.click();
			break;
		case Labels:
			PanelItem_Labels.click();
			break;
		case Filters:
			PanelItem_Filters.click();
			break;
		case Settings:
			PanelItem_Settings.click();
			break;
		default:
		
		}	
	}	
}