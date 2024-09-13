package syncronyzation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public ExpliciteWait(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@type='text']")	public WebElement uName;
	@FindBy (xpath="//input[@type='password']") public WebElement paSS;
	@FindBy (xpath="//button[text()='LOGIN']") public WebElement lbutton1;
	
	
	
	public WebElement userName(String EnterUsrname) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOf(uName));
		uName.sendKeys(EnterUsrname);
		return uName;

	}
	
	
	public WebElement password1(String Enterpass) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(paSS));
	paSS.sendKeys(Enterpass);
	return paSS;
	}

	
	
	public void LoginButton() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(lbutton1));
		lbutton1.click();
	
		
	}
	
}
