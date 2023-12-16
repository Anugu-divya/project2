package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class Removeproductfromcart extends Abstractclass {

	WebDriver driver;

	public Removeproductfromcart(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='/view_cart'])[1]")
	WebElement cart;
	@FindBy(xpath = "(//td[@class='cart_delete'])[1]")
	WebElement btn;

	public void removeproduct() {
		implicitlywaitmethod();
		cart.click();
		btn.click();
	}
}
