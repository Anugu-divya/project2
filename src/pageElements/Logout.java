package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Logout extends Abstractclass {
	WebDriver driver;

	public Logout(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement loginbutton2;
	@FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
	WebElement loginPrompt1;
	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement enteremail;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	WebElement submit1;
	@FindBy(xpath = "//input[@name='password']")
	WebElement enterpassword;
	@FindBy(xpath = "//*[contains(text(),' Logged in as ')]")
	WebElement loggedInMessage;
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logoutButton;
	@FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
	WebElement loginPrompt2;

	public void login() {
		implicitlywaitmethod();
		String expectedTitle = "Automation Exercise";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page is not visible successfully");
		loginbutton2.click();
		Assert.assertTrue(loginPrompt1.isDisplayed(), "'Login to your account' is not visible");

		enteremail.sendKeys("divyaanugu1@gmail.com");
		enterpassword.sendKeys("Anugu@32");
		submit1.click();
//loggedinmsg
		Assert.assertTrue(loggedInMessage.isDisplayed(), "'Logged in as username' is not visible");
		logoutButton.click();
		Assert.assertTrue(loginPrompt2.isDisplayed(), "User is not navigated to the login page");
	}
}