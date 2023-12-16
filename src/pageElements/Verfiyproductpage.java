package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Verfiyproductpage extends Abstractclass {
	WebDriver driver;

	public Verfiyproductpage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement product;
	@FindBy(xpath = "/product_details/1")
	WebElement viewproduct;
	@FindBy(xpath = "//h2[contains(text(),'Category')]")
	WebElement category;
	@FindBy(xpath = "//h2[contains(text(),'Brands')]")
	WebElement brands;
	@FindBy(xpath = "//b[contains(text(),'Availability')]")
	WebElement available;
	@FindBy(xpath = "//b[contains(text(),'Condition')]")
	WebElement conditions;
	@FindBy(xpath = "//b[contains(text(),'Brand')]")
	WebElement brand;

	public void productpage() {
		implicitlywaitmethod();

		String expectedTitle = "Automation Exercise";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page is not visible successfully");
		product.click();
		viewproduct.click();
		category.click();
		brands.click();
		available.click();
		conditions.click();
		brand.click();
	}
}
