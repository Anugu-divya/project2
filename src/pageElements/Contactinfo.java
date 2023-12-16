package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Abstractclass;

public class Contactinfo extends Abstractclass {
	WebDriver driver;
	public Contactinfo(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}	
	
@FindBy(xpath="//a[@href='/contact_us']")
WebElement contactus ;
@FindBy(xpath="(//h2[@class='title text-center'])[2]")
WebElement Getintouch;
@FindBy(xpath="//input[@name='name']")
WebElement  name1;
@FindBy(xpath="//input[@name='email']")
WebElement email1;
@FindBy(xpath="//input[@name='subject']")
WebElement subject;
@FindBy(xpath="//textarea[@name='message']")
WebElement  message;
//@FindBy(xpath="//input[@name='upload_file']")
//WebElement file;
@FindBy(xpath="//input[@name='submit']")
WebElement submit;
@FindBy(xpath="//div[contains(text(),'Success! Your details have been submitted successfully')]")
WebElement verfiysucessmessage;
@FindBy(xpath="//a[@class='btn btn-success']")
WebElement home;

	public void contactinformation() {
		implicitlywaitmethod();
		 String expectedTitle = "Automation Exercise";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Did not land on the home page successfully");
		contactus.click();
		name1.sendKeys("divyaanugu1@gmail.com");
		email1.sendKeys("Anugu@32");
		subject.sendKeys("Excelr");
		message.sendKeys("Completed");
		 Assert.assertTrue(Getintouch.isDisplayed(), "'GET IN TOUCH' is not visible");
		// file.sendKeys("")
		 submit.click();
		 Assert.assertTrue(verfiysucessmessage.isDisplayed(), "Success message is not visible");
		 home.click();
		 String expectedTitle1 = "Automation Exercise";
	        String actualTitle1 = driver.getTitle();
	        Assert.assertEquals(actualTitle1, expectedTitle1, "Did not land on the home page successfully");
	}
	
}
