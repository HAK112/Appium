package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DefaultCalculatorPage {

	private AppiumDriver<MobileElement> driver;
	
	@AndroidFindBy(id="digit0")
	MobileElement cancelButton;
	
	@AndroidFindBy(id="digit0")
	MobileElement digitZero;
	
	@AndroidFindBy(id="digit1")
	MobileElement digitOne;
	
	@AndroidFindBy(id="digit2")
	MobileElement digitTwo;
	
	@AndroidFindBy(id="digit3")
	MobileElement digitThree;
	
	@AndroidFindBy(id="digit4")
	MobileElement digitFour;
	
	@AndroidFindBy(id="digit5")
	MobileElement digitFive;
	
	@AndroidFindBy(id="digit6")
	MobileElement digitSix;
	
	@AndroidFindBy(id="digit7")
	MobileElement digitSeven;
	
	@AndroidFindBy(id="digit8")
	MobileElement digitEight;
	
	@AndroidFindBy(id="digit9")
	MobileElement digitNine;
	
	@AndroidFindBy(id="plus")
	MobileElement operatorPlus;
	
	@AndroidFindBy(id="minus")
	MobileElement operatorMinus;
	
	@AndroidFindBy(id="mul")
	MobileElement operatorMultiply;
		
	@AndroidFindBy(id="div")
	MobileElement operatorDivide;
	
	@AndroidFindBy(id="equal")
	MobileElement operatorEquals;
	
	@AndroidFindBy(id="edittext")
	MobileElement result;

	public DefaultCalculatorPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}

	public void clickDigitZero() {
		digitZero.click();
	}
	
	public void clickDigitOne() {
		digitOne.click();
	}
	
	public void clickDigitTwo() {
		digitTwo.click();
	}
	
	public void clickDigitThree() {
		digitThree.click();
	}
	
	public void clickDigitFour() {
		digitFour.click();
	}
	
	public void clickDigitFive() {
		digitFive.click();
	}
	
	public void clickDigitSix() {
		digitSix.click();
	}
	
	public void clickDigitSeven() {
		digitSeven.click();
	}
	
	public void clickDigitEight() {
		digitEight.click();
	}
	
	public void clickDigitNine() {
		digitNine.click();
	}
	
	public void clickOperatorPlus() {
		operatorPlus.click();
	}
	
	public void clickOperatorMinus() {
		operatorMinus.click();
	}
	
	public void clickOperatorMultiply() {
		operatorMultiply.click();
	}
	
	public void clickOperatorDivide() {
		operatorDivide.click();
	}
	
	public void clickOperatorEquals() {
		operatorEquals.click();
	}
	
	public String getResult() {
		return result.getText();
	}
	
	public void removeDefaultScreen() {
		operatorDivide.click();
	}
	
	public void clearScreen() {
		cancelButton.click();
	}

}