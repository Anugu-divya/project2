package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Searchproductandlogin {

	WebDriver driver;
	public Logout lo; 
	public Searchproductandlogin(WebDriver driverhere) {

		this.driver = driverhere;
	
		PageFactory.initElements(driver, this);
	}	
	
	
	public void searchproduct() {
		
	
	}
	
	
	}