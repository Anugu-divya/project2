package utilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageElements.LoginPage;
import pageElements.Signinpage;

public class Basetest {

	
	public WebDriver driver;
	
	public WebDriver intializebrowser() throws IOException { 
		WebDriver driver = new ChromeDriver();
	    return driver;
	}
	
	
	public Signinpage LaunchApplication() throws IOException {
		driver=intializebrowser();
		Signinpage Sp = new Signinpage(driver);
		Sp.goTo();
		return Sp;
	}
	
//	@AfterMethod
//	public void CloseBrowser() {
//		
//		driver.quit();
//	}
}
