package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class Brandproducts extends Abstractclass {

	WebDriver driver;
	public Brandproducts(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;

	@FindBy(xpath = "//a[@href='/brand_products/Polo']")
	public WebElement polo;

	@FindBy(xpath = "//a[@href='/brand_products/Madame']")
	public WebElement madame;

	public void brandproduct() {
		implicitlywaitmethod();
		
		products.click();
		System.out.println("Brands are visible on left side bar");
		polo.click();
		System.out.println("user is navigated to brand page and brand products are displayed");
		madame.click();
		System.out.println("user is navigated to that brand page and can see products");

	
	} 
	}