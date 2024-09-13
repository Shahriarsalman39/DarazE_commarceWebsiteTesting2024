package pf_WithPOM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTestForDarazBD {

	
	public WebDriver driver;
	String Browser="Chrome";
	
	
	public WebDriver openApplication() {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver =new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("Firefox")) {
			driver =new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("Edge")) {
			driver =new EdgeDriver();
		}
		else {
			System.out.println("we do not support this Browser : ");
		}
		
		driver.get("https://member.daraz.com.bd/user/login?spm=a2a0e.tm80335401.header.login.22df6gg36gg3RB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		}
	
	
	
	public void closeApplication() {
		
		if(driver != null) {
			driver.quit();
			
		}
	}
}


