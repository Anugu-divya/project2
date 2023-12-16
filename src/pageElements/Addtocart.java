package pageElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Addtocart extends Abstractclass {

	WebDriver driver;

	public Addtocart(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
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
	@FindBy(xpath = "//u[contains(text(),'View Cart')]")
	WebElement ViewCart;
	@FindBy(xpath = "//section[@id='cart_items']")
	List<WebElement> cartitem;

	@FindBy(xpath = "(//td[@class='cart_price'])[1]")
	WebElement firstProductPrice;

	@FindBy(xpath = "(//td[@class='cart_price'])[2]")
	WebElement secondProductPrice;
	@FindBy(xpath = "//td[@class='cart_quantity'])[1]")
	WebElement firstProductQuantity;
	@FindBy(xpath = "//td[@class='cart_quantity'])[2]")
	WebElement secondProductQuantity;
	@FindBy(xpath = "(//td[@class='cart_total'])[1]")
	WebElement firstProductTotalPrice;
	@FindBy(xpath = "(//td[@class='cart_total'])[2]")
	WebElement secondProductTotalPrice;

	public void items() {
		implicitlywaitmethod();
		String expectedTitle = "Automation Exercise";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page is not visible successfully");
		products.click();
		// firstproduct.click();
		Actions act = new Actions(driver);
		act.moveToElement(firstproduct).perform();
		item2.click();
		continuebutton.click();
		Actions act1 = new Actions(driver);
		act1.moveToElement(secondproduct).perform();
		item3.click();
		ViewCart.click();
		Assert.assertEquals(cartitem.size(), 2, "Both products are not added to the Cart");
		Assert.assertTrue(firstProductPrice.isDisplayed(), "First product price is not visible");
		Assert.assertTrue(secondProductPrice.isDisplayed(), "Second product price is not visible");

		Assert.assertTrue(firstProductQuantity.isDisplayed(), "First product quantity is not visible");
		Assert.assertTrue(secondProductQuantity.isDisplayed(), "Second product quantity is not visible");

		Assert.assertTrue(firstProductTotalPrice.isDisplayed(), "First product total price is not visible");
		Assert.assertTrue(secondProductTotalPrice.isDisplayed(), "Second product total price is not visible");
	}
}
