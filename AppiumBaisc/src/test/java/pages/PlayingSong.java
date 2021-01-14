package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PlayingSong {
	private AppiumDriver<MobileElement> driver;
	
	@AndroidFindBy(id = "song_name")
	MobileElement songName;
	
	public PlayingSong(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}
	
	public String getSongName() {
		return songName.getText();
	}
}
