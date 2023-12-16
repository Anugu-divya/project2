package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Testcasepage extends Abstractclass {
	WebDriver driver;
	public Testcasepage(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//a[@href='/test_cases']")
	WebElement testcase;
	
	public void testcases() {
		implicitlywaitmethod();
		 String expectedTitle = "Automation Exercise";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Home page is not visible successfully");
	testcase.click();
	String expectedTitle1 = "Test Cases - Automation Exercise";
    String actualTitle1 = driver.getTitle();
    Assert.assertEquals(actualTitle1, expectedTitle1, "User is not navigated to the test cases page successfully");
	}
}
