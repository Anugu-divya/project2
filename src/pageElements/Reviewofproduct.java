package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class Reviewofproduct extends Abstractclass {
	WebDriver driver;

	public Reviewofproduct(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement product;
	@FindBy(xpath = "/product_details/1")
	WebElement viewproduct;
	@FindBy(xpath = "//textarea[@name='review']")
	WebElement review;
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//button[@id='button-review']")
	WebElement submit;

	public void reviewproduct() {
		implicitlywaitmethod();
		product.click();
		viewproduct.click();
		review.sendKeys("The product is good");
		name.sendKeys("Divya");
		email.sendKeys("anugudivya3254@gmail.com");
		submit.click();
	}
}