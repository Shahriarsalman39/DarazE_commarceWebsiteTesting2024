package locator;


import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class XpathLoopAndDynamicXpathForDarazBD extends BaseTestForDarazBD{

	@BeforeMethod
	public void opendaraz() {
		openApplication();
		
}
	@Test
	public void basicXpath1() {
		driver.findElement(By.xpath("//div[@class='pull-left']/a[2]")).click();	
		
	}
	

	@Test
	public void xpathLoop2() {
		driver.findElement(By.xpath("//div[@class='lzd-footer-width-25']/ul/li[8]")).click();
		
	}
	
	@Test
	public void xpathLoop3() {
		driver.findElement(By.xpath("//div[@class='drz-footer-venture-wrapper']/a[3]")).click();
		
	}
	
	@Test
	public void xpathdynamic1() {
		driver.findElement(By.xpath("//button[contains(@class,'mod-button third-')][2]")).click();
		
	}
	
	@Test
	public void xpathdynamic2() {
		driver.findElement(By.xpath("//button[contains(@class,' third-party-login-pc-btn')]")).click();
		
	}
	
	@AfterMethod
	public void closedaraz() {
		closeApplication();
	}
	
}
