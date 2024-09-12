package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class BasicXpathForDarazBD extends BaseTestForDarazBD{

	@BeforeMethod
	public void opendaraz() {
		openApplication();
		
}
	@Test
	public void basicXpath() {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Salman");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ahgvHo");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		
		
	}
	@Test
	public void basicXpath1() {
		WebElement text= driver.findElement(By.xpath("//h3[contains(text(),'Welcome to ')]"));	
		System.out.println(text+ "text is : ");
	}
	
	@Test
	public void basicXpath2() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();	
		
	}
	@Test
	public void basicXpath3() {
		WebElement text1= driver.findElement(By.xpath("//h3[@class='lzd-footer-h3']"));	
		 System.out.println(text1+ "text is : ");
	}
	
	
	
	
	
	@AfterMethod
	public void closedaraz() {
		closeApplication();
	}
	
}
