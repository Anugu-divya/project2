package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Productquantity extends Abstractclass {

	WebDriver driver;

	public Productquantity(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/product_details/1")
	WebElement viewproduct;
	@FindBy(xpath = "//div[@class='product-information']")
	WebElement productdetails;
	@FindBy(xpath = "//input[@id='quantity']")
	WebElement qunatity;

	@FindBy(xpath = "//button[@class='btn btn-default cart']")
	WebElement addtocart;
	@FindBy(xpath = "//u[contains(text(),'View Cart')]")
	WebElement ViewCart;
	@FindBy(xpath = "//td[@class='cart_quantity'])[2]")
	WebElement secondProductQuantity;

	public void product() {
		implicitlywaitmethod();
		viewproduct.click();
		Assert.assertTrue(productdetails.isDisplayed(), "Product detail page is not opened successfully");
		qunatity.clear();
		qunatity.sendKeys("4");
		addtocart.click();
		ViewCart.click();
		Assert.assertEquals(secondProductQuantity.getAttribute("value"), "4",
				"Product quantity in the cart is not as expected");
	}
}
