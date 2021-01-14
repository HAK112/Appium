package tests.calculator;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.DefaultCalculatorPage;

public class BaseClassCalculator{
	public AppiumDriver<MobileElement> driver;
	DefaultCalculatorPage defaultCalculatorPage;
	@BeforeTest
	public void setUp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();

//			capabilities.setCapability("platformName", "ANDROID");
//			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(CapabilityType.VERSION, "5.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Oppo F1s");
			capabilities.setCapability(MobileCapabilityType.UDID, "RSMF9HKJAQQGVCUG");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

//			capabilities.setCapability(MobileCapabilityType.APP, "");
//			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			capabilities.setCapability("appPackage", "com.android.calculator2");
			capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,capabilities);
			//			driver = new AndroidDriver<MobileElement>(url,capabilities);
			//			driver = new IOSDriver<MobileElement>(url,capabilities);
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
