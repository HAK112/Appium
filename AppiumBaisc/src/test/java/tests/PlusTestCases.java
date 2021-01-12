package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DefaultCalculatorPage;

public class PlusTestCases extends BaseClass {
	@Test
	public void basicCalculation() {
		defaultCalculatorPage = new DefaultCalculatorPage(driver);
		defaultCalculatorPage.removeDefaultScreen();
		defaultCalculatorPage.clickDigitSeven();
		defaultCalculatorPage.clickOperatorPlus();
		defaultCalculatorPage.clickDigitNine();
		defaultCalculatorPage.clickOperatorEquals();
//		Assert.assertEquals("7+9\r\n=16", defaultCalculatorPage.getResult());
		Assert.assertTrue(defaultCalculatorPage.getResult().contains("25"));
	}
}
