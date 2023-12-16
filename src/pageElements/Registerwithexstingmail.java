package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Registerwithexstingmail extends Abstractclass {
	WebDriver driver;

	public Registerwithexstingmail(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement sign;

	@FindBy(xpath = "//input[@name='name']")

	WebElement names;
	@FindBy(xpath = "(//input[@name='email'])[2]")

	WebElement email;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")

	WebElement signin;

	@FindBy(xpath = "//p[contains(text(),'Email Address already exist!')]")
	WebElement errormsg;

	public void register() {
		implicitlywaitmethod();
		sign.click();
		names.sendKeys("anugu divya");
		email.sendKeys("divyaanugu1@gmail.com");
		signin.click();
		Assert.assertTrue(errormsg.isDisplayed(), "Error message is not visible");
	}
}