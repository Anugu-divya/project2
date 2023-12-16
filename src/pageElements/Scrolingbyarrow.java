package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class Scrolingbyarrow extends Abstractclass {

	WebDriver driver;

	public Scrolingbyarrow(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//footer[@id = 'footer']")
	WebElement scrolldown;

	@FindBy(xpath = "//a[@id='scrollUp']")
	WebElement arrow;

	public void scroll() {
		implicitlywaitmethod();
		scrolldown.click();
		System.out.println("Verify text 'SUBSCRIPTION'");
		arrow.click();
		System.out.println("Automation Engineers' text is visible on screen");
	}
}
