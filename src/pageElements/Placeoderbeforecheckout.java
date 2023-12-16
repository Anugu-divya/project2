package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Placeoderbeforecheckout extends Abstractclass {

	WebDriver driver;

	public Placeoderbeforecheckout(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='product-overlay'])[2]")
	WebElement firstproduct;
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
	WebElement item2;
	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	WebElement continuebutton;
	@FindBy(xpath = "(//div[@class='product-overlay'])[2]")
	WebElement secondproduct;
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[4]")
	WebElement item3;
	@FindBy(xpath = "/product_details/1")
	WebElement viewproduct;
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement proceed;
	@FindBy(xpath = "(//a[@href='/login'])[2]")
	WebElement login;
	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement enteremail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement enterpassword;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	WebElement submit1;
	@FindBy(xpath = "//*[contains(text(),' Logged in as ')]")
	WebElement loggedInMessage;

	@FindBy(xpath = "(//a[@href='/view_cart'])[1]")
	WebElement cart;
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement proceed1;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement addressDetailsTitle;
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement commentTextArea;

	@FindBy(xpath = "//a[@href='/payment']")
	WebElement placeOrderButton;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement Cardname;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement CardNumber;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement CVC;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Expiration;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement year;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement confirmorder;

	public void checkout() {
		implicitlywaitmethod();
		Actions act = new Actions(driver);
		act.moveToElement(firstproduct).perform();
		item2.click();
		continuebutton.click();
		Actions act1 = new Actions(driver);
		act1.moveToElement(secondproduct).perform();
		item3.click();
		viewproduct.click();
		proceed.click();
		login.click();
		enteremail.sendKeys("divyaanugu1@gmail.com");
		enterpassword.sendKeys("Anugu@32");
		submit1.click();
		Assert.assertTrue(loggedInMessage.isDisplayed(), "'Logged in as username' is not visible");
		cart.click();
		proceed1.click();
		Assert.assertTrue(addressDetailsTitle.isDisplayed(),
				"Address Details and Review Your Order page is not displayed");
		addressDetailsTitle.click();
		commentTextArea.sendKeys("This is a test order comment");
		Cardname.sendKeys("Mohitha");
		CardNumber.sendKeys("521478963214");
		CVC.sendKeys("488");
		Expiration.sendKeys("05");
		year.sendKeys("2026");
		confirmorder.click();

	}

}
