package keyWordFaramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjectModel.BaseTestForDarazBD;


public class Login_test extends BaseTestForDarazBD{

	
	
	Login_page pf;
	Test_Reader tr;
	
	@BeforeMethod(groups= {"Smoke","Funtionality","regression"})
	public void openDaraz() {
		openApplication();
	}
	
	@Test(groups= {"Smoke","Funtionality","regression"})
	public void ValidLoginTest() {
		pf=new Login_page(driver);
		tr=new Test_Reader();
		pf.username(tr.readUserName());
		pf.password(tr.readPass());
		pf.lbutton();
	
	}
	@Test(groups= {"Funtionality","regression"})
	public void InValidLoginTest1() {
		pf=new Login_page(driver);
		tr=new Test_Reader();
		pf.username(tr.readUserName());
		pf.password(tr.readPass());
		pf.lbutton();
	
	}
	@Test(groups= {"Smoke","Funtionality"})
	public void InValidLoginTest2() {
		pf=new Login_page(driver);
		tr=new Test_Reader();
		pf.username(tr.readUserName());
		pf.password(tr.readPass());
		pf.lbutton();
	
	}
	@Test(groups= {"Smoke","regression"})
	public void InValidLoginTest3() {
		pf=new Login_page(driver);
		tr=new Test_Reader();
		pf.username(tr.readUserName());
		pf.password(tr.readPass());
		pf.lbutton();
	
	}
	
	
	
	@AfterMethod(groups= {"Smoke","Funtionality","regression"})
	public void closeDaraz() {
		closeApplication();
	}
}
