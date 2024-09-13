package pf_WithPOM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjectModel.BaseTestForDarazBD;


public class PF_loginTest extends BaseTestForDarazBD{

	
	PF_loginPage lp1;
	
	
	@BeforeMethod
	public void openDaraz() {
		openApplication();
	}
	
	@Test
	public void ValidLoginTest() {
		PF_loginPage pf = new PF_loginPage(driver);
		pf.username("Shahriarsalman39@gmail.com");
		pf.password("onukabbo7895");
		pf.lbutton();
			
	
	}
	
	
	
	
	@AfterMethod
	public void closeDaraz() {
		closeApplication();
	}
}
