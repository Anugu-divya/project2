package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Abstractclass;

public class LoginPage  extends Abstractclass{
	WebDriver driver;

	public LoginPage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}	
		@FindBy(xpath="//a[@href='/login']")
		WebElement loginbutton;
		@FindBy(xpath= "(//input[@name='email'])[1]")
		WebElement enteremail;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement enterpassword;
		@FindBy(xpath="(//button[@class='btn btn-default'])[1]")
		WebElement submit;



public void enterdetails (String email, String password) {
	implicitlywaitmethod();
	enteremail.sendKeys(email);
	enterpassword.sendKeys(password);
		submit.click();

	}
		
		
	}
