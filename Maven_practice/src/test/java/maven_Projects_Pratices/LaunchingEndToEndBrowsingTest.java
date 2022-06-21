package maven_Projects_Pratices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingEndToEndBrowsingTest extends ChromeTest {
	@Test
	public void EndToEndTC(){
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		String Email="prakashasit17@gmail.com";
		String PWD="Prakash@17";
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		if(driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]")).isDisplayed());
		{
			System.out.println("In the shopcart items displayed");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();  
	}


}
