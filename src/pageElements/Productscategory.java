package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class Productscategory extends Abstractclass {

	WebDriver driver;

	public Productscategory(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='#Women']")
	public WebElement women;

	@FindBy(xpath = "(//span[@class='badge pull-right'])[1]")
	public WebElement add1;

	@FindBy(xpath = "//a[@href='/category_products/2']")
	public WebElement tops;

	@FindBy(xpath = "//a[@href='#Men']")
	public WebElement men;

	@FindBy(xpath = "(//span[@class='badge pull-right'])[2]")
	public WebElement add2;

	@FindBy(xpath = "//a[@href='/category_products/3']")
	public WebElement tshirt;

	public void productcategory() {
		implicitlywaitmethod();
		women.click();
		add1.click();
		tops.click();
		System.out.println("confirm text 'WOMEN - TOPS PRODUCTS'");
		men.click();
		add2.click();
		tshirt.click();
		System.out.println("user is navigated to that category page");

	}

}
