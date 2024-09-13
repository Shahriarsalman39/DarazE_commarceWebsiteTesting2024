package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestForDarazBD{

	LoginPage lp ;
	
	@BeforeMethod
	public void openDaraz() {
		openApplication();
	}
	
	
	@Test
	public void ValidLoginTest() {
		lp = new LoginPage(driver);
		lp.username("Shahriarsalman39@gmail.com");
		lp.password("Onukabbo5");
		lp.lbutton();
	}
	
	
	
	@AfterMethod
	public void closeDaraz() {
		closeApplication();
	}
}
