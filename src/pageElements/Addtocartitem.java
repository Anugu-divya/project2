package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class Addtocartitem extends Abstractclass{

	WebDriver driver;
	public Addtocartitem(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//div[@class='footer-widget']")
	WebElement scrolldown;
	
	@FindBy(xpath="(//a[@data-product-id='4'])[3]")
	WebElement addcart;
	
	@FindBy(xpath="(//a[@href='/view_cart'])[2]")
	WebElement viewcart;

	public void addtocart () {
		implicitlywaitmethod();
		scrolldown.click();
		System.out.println("'RECOMMENDED ITEMS' are visible");
		addcart.click();
		viewcart.click();
		System.out.println("product is displayed in cart page");
		
	}
	}