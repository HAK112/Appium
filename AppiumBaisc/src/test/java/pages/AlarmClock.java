package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlarmClock {
	private AppiumDriver<MobileElement> driver;
	
	@AndroidFindBy(accessibility = "94bf1f1f-99e5-4a75-9c76-612144558340")
	MobileElement alarmId;
	
	public AlarmClock(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}
	
	public String getAlarmTime() {
		return alarmId.getText();
	}
}
