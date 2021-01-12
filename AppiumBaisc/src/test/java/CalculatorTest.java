import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
//  For Selenium Specific
//	WebDriver driver;
	
//  For Appium Specific
	static AppiumDriver<MobileElement> appiumDriver;
	
//	For Android Specific
//	AndroidDriver androidDriver;
	
//  For IOS Specific	
//	IOSDriver iosDriver; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception exception) {
			System.out.println(exception.getCause());
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public static void openCalculator() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "Oppo F1s");
		capabilities.setCapability("uid", "RSMF9HKJAQQGVCUG");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersoin", "5.1");
		
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		appiumDriver = new AppiumDriver<MobileElement>(url,capabilities);
		
		System.out.println("Application Started");
		basicCalculation();
	}
	
	public static void basicCalculation() {
		MobileElement digitTwo = appiumDriver.findElement(By.id("com.android.calculator2:id/digit2"));
		MobileElement operatorPlus = appiumDriver.findElement(By.id("com.android.calculator2:id/plus"));
		MobileElement digitThree = appiumDriver.findElement(By.id("com.android.calculator2:id/digit3"));
		MobileElement operatorEquals = appiumDriver.findElement(By.id("com.android.calculator2:id/equal"));
		MobileElement result = appiumDriver.findElement(By.id("com.android.calculator2:id/edittext"));
		
		digitTwo.click();
		digitTwo.click();
		operatorPlus.click();
		digitThree.click();
		operatorEquals.click();
		String resultString = result.getText();
		System.out.println("Result is:\n"+resultString);
		System.out.println("Completed");
	}
}