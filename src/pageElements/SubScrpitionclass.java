package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class SubScrpitionclass extends Abstractclass {
	WebDriver driver;

	public SubScrpitionclass(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='susbscribe_email']")
	WebElement email;
	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
	WebElement arrow;

	public void subscriber() {
		implicitlywaitmethod();
		String expectedTitle = "Automation Exercise";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page is not visible successfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("subscribe.scrollBy(0, 500);");
		email.sendKeys("anugudivya3254@gmail.com");
		arrow.click();

		// JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// js1.executeScript("subscribe.scrollBy(0, -500);");

	}
}