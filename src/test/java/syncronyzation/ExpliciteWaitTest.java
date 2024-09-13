package syncronyzation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import locator.BaseTestForDarazBD;


public class ExpliciteWaitTest extends BaseTestForDarazBD {

	
	
	
	@BeforeMethod
	public void openDaraz() {
		openApplication();
	}
	
	
	@Test
	public void ValidLoginTest() {
		ExpliciteWait ex = new ExpliciteWait(driver);
		ex.userName("shahrair");
		ex.password1("ahm");
		ex.LoginButton();
	}
	
	
	
	
	@AfterMethod
	public void closeDaraz() {
		closeApplication();
	}
}
