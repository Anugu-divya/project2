package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractclass {

	WebDriver driver;
	public Abstractclass(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Wait_Till_Link_Is_Clickable(By FindBy) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(FindBy));				
	}
	
	
	
	public void implicitlywaitmethod(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

}
