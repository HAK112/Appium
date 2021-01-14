package tests.song;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClassSong{
	public AndroidDriver<MobileElement> driver;
	@BeforeTest
	public void setUp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(CapabilityType.VERSION, "5.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Oppo F1s");
			capabilities.setCapability(MobileCapabilityType.UDID, "RSMF9HKJAQQGVCUG");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			capabilities.setCapability("appPackage", "com.oppo.music");
			capabilities.setCapability("appActivity", "com.oppo.music.MainListActivity");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url,capabilities);
		} catch (Exception e) {
			System.out.println("Cause: "+e.getCause());
			System.out.println("Message: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
