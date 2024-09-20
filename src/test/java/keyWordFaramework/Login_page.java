package keyWordFaramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	WebDriver drive;


	public Login_page(WebDriver drive) {
		super();
		this.drive = drive;
		PageFactory.initElements( drive, this);
	}
	
	
	@FindBy (xpath="//input[@type='text']") public WebElement uName;
	public WebElement username(String enterusername) {
		uName.sendKeys(enterusername);
		return uName;
		
	}
	
	@FindBy (xpath= "//input[@type='password']") public WebElement paSSW;
	public WebElement password(String enterusername) {
		paSSW.sendKeys(enterusername);
		return paSSW;
		
	}
	
	@FindBy (xpath="//button[text()='LOGIN']") public WebElement lButton1;
	public void lbutton() {
		lButton1.click();
	}
	
	
}
