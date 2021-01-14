package stepDefinations;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DefaultCalculatorPage;

public class Calculator {
	public AndroidDriver<MobileElement> driver;
	DefaultCalculatorPage defaultCalculatorPage;

	@Before
	public void setUp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(CapabilityType.VERSION, "5.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Oppo F1s");
			capabilities.setCapability(MobileCapabilityType.UDID, "RSMF9HKJAQQGVCUG");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			capabilities.setCapability("appPackage", "com.android.calculator2");
			capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url,capabilities);
			defaultCalculatorPage = new DefaultCalculatorPage(driver);
		} catch (Exception e) {
			System.out.println("Cause: "+e.getCause());
			System.out.println("Message: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@Given("Application is Open")
	public void application_is_open() {
		if(driver==null)
			return;
	}

	@When("User Clicks on clear screen button")
	public void user_clicks_on_clear_screen_button() {
		defaultCalculatorPage.clearScreen();
	}

	@When("Enters the First Number")
	public void enters_the_first_number() {
		defaultCalculatorPage.clickDigitFour();
	}
	
	@And("Enters the Second Number")
	public void enters_the_second_number() {
		defaultCalculatorPage.clickDigitTwo();
	}
	
	@And("Clicks on Equal Operator")
	public void clicks_on_equal_operator() {
	    defaultCalculatorPage.clickOperatorEquals();
	}

	@And("Enters the Multiplication Operation")
	public void enters_the_multiplication_operation() {
		defaultCalculatorPage.clickOperatorMultiply();
	}
	
	@And("Enters the Division Operation")
	public void enters_the_division_operation() {
		defaultCalculatorPage.clickOperatorDivide();
	}
	
	@And("Enters the Addition Operation")
	public void enters_the_addition_operation() {
		defaultCalculatorPage.clickOperatorPlus();
	}
	
	@And("Enters the Subtraction Operation")
	public void enters_the_subtraction_operation() {
		defaultCalculatorPage.clickOperatorMinus();
	}
	
	@Then("Verify The Answer")
	public void verify_the_answer() {
	    System.out.println(defaultCalculatorPage.getResult());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
