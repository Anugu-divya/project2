package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Invaliddetails extends Abstractclass {
	WebDriver driver;
	public Invaliddetails(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//a[@href='/login']")
	WebElement loginbutton1;
	@FindBy(xpath="//h2[contains(text(),'Login to your account')]")
	WebElement loginPrompt ;
	@FindBy(xpath= "(//input[@name='email'])[1]")
	WebElement enteremail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement enterpassword;
	@FindBy(xpath="(//button[@class='btn btn-default'])[1]")
	WebElement submit;
	@FindBy(xpath="//p[contains(text(),'Your email or password is incorrect!')]")
	WebElement errorMessage1; 
	public void validation () {
		implicitlywaitmethod();
		 String expectedTitle = "Automation Exercise";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Home page is not visible successfully");
	        loginbutton1.click();
	        Assert.assertTrue(loginPrompt.isDisplayed(), "'Login to your account' is not visible");
	        enteremail.sendKeys("divyaanugu1@gmail.com");
	        enterpassword.sendKeys("Divya54!");
	        submit.click();
	        Assert.assertTrue(errorMessage1.isDisplayed(), "Error message is not visible");
    }
	}

