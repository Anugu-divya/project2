package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Searchproduct extends Abstractclass {
	WebDriver driver;

	public Searchproduct(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement product1;
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement search;
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement submit;
	@FindBy(xpath = "//h2[@class='title text-center']")
	WebElement searchproduct;
	// @FindBy(xpath="")
//	WebElement ;

	public void product() {
		implicitlywaitmethod();
		product1.click();
		search.sendKeys("Men T_shrit");
		submit.click();
		Assert.assertTrue(searchproduct.isDisplayed(), "Searched products page not loaded successfully");
		Assert.assertTrue(searchproduct.isDisplayed(), "not found in search results");
	}

}
