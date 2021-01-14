package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SongMenu {
	private AppiumDriver<MobileElement> driver;
	
	@AndroidFindBy(accessibility = "control bar")
	MobileElement SongControllBar;
	
	public SongMenu(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}
	
	public void clickOnCurrentSong() {
		SongControllBar.click();
		System.out.println("Clicked on Current Song");
	}
}
