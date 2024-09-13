package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	WebDriver driver;


	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement username(String uName) {
		WebElement enterusername =driver.findElement(By.xpath("//input[@type='text']"));
		enterusername.sendKeys(uName);
		return enterusername;
		
	}
	
	public WebElement password(String paSS) {
		WebElement enterpass = driver.findElement(By.xpath("//input[@type='password']"));
		enterpass.sendKeys(paSS);
		return enterpass;
		
	}
	
	public void lbutton() {
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
	}
	
}
