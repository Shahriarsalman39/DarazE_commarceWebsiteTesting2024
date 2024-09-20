package keyWordFaramework;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base_test {

	
	public WebDriver driver;
	//String Browser="Chrome";

	Test_Reader tr;
	
	public WebDriver openApplication() {
	
		tr=new Test_Reader();
		String Browser= tr.readBrowser();
		
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
		String QAEURL= tr.readUrl();
		driver.get(QAEURL);
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


