package pageElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.Abstractclass;

public class Signinpage extends Abstractclass {
	WebDriver driver;

	public Signinpage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement sign;

	@FindBy(xpath = "//input[@name='name']")

	WebElement names;
	@FindBy(xpath = "(//input[@name='email'])[2]")

	WebElement email;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")

	WebElement signin;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement mrs;

	@FindBy(xpath = "//input[@name='password']")

	WebElement key;

	@FindBy(xpath = "(//select[@class='form-control'])[1]")

	WebElement day;

	@FindBy(xpath = "(//select[@class='form-control'])[2]")

	WebElement month;

	@FindBy(xpath = "(//select[@class='form-control'])[3]")

	WebElement year;

	@FindBy(xpath = "//input[@name='optin']")

	WebElement checkboxes;

	@FindBy(xpath = "(//input[@class='form-control'])[4]")

	WebElement firstname;

	@FindBy(xpath = "(//input[@class='form-control'])[5]")

	WebElement lastname;

	@FindBy(xpath = "(//input[@class='form-control'])[6]")

	WebElement company;

	@FindBy(xpath = "(//input[@class='form-control'])[7]")

	WebElement Address;

	@FindBy(xpath = "(//input[@class='form-control'])[8]")

	WebElement adress1;

	@FindBy(xpath = "//select[@id='country']")

	WebElement country;

	@FindBy(xpath = "(//input[@class='form-control'])[9]")

	WebElement state;

	@FindBy(xpath = "(//input[@class='form-control'])[10]")

	WebElement city;

	@FindBy(xpath = "(//input[@class='form-control'])[11]")

	WebElement zipcode;

	@FindBy(xpath = "(//input[@class='form-control'])[12]")

	WebElement mobileno;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	WebElement creataccount;

	@FindBy(xpath = "//i[@class='fa fa-trash-o']")
	WebElement delet;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement contine;

	@FindBy(xpath = "//a[@href='/delete_account']")
	WebElement deleticon;
	// @FindBy(xpath = "//i[@class='fa fa-lock']/parent::a")
	// WebElement logout;
//	@FindBy(xpath = "//*[contains(text(),'Email Address already exist!')]")
//	WebElement errormsg;

	public void entersignindetails(String name, String mail, String pass) throws InterruptedException {
		implicitlywaitmethod();
		sign.click();
		names.sendKeys(name);
		email.sendKeys(mail);
		signin.sendKeys(pass);
		Thread.sleep(2000);
		mrs.click();
		System.out.println("Current page title is : " + driver.getTitle() + ", time: " + System.currentTimeMillis());
		key.sendKeys(pass);
		Select sel = new Select(day);
		sel.selectByValue("17");
		Select sel1 = new Select(month);
		sel1.selectByIndex(10);

		Select sel2 = new Select(year);
		sel2.selectByVisibleText("2001");
		checkboxes.click();
		firstname.sendKeys("Divya");
		lastname.sendKeys("Anugu");
		company.sendKeys("Excelr");
		Address.sendKeys("Palakuthy");
		adress1.sendKeys("Hyderabad");

		Select sel3 = new Select(country);
		sel3.selectByVisibleText("India");
		state.sendKeys("Telangana");
		city.sendKeys("Hyderabad");
		zipcode.sendKeys("506244");
		mobileno.sendKeys("6300381942");
		creataccount.click();
		delet.click();
		System.out.println("Current page title is : " + driver.getTitle() + ", time: " + System.currentTimeMillis());
		contine.click();
		deleticon.click();
		// logout.click();
		// Assert.assertEquals(errormsg.getText(), "Email Address already exist!");

	}
}
