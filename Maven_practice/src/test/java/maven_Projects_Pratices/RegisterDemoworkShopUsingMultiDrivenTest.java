package maven_Projects_Pratices;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterDemoworkShopUsingMultiDrivenTest{
	@Test(dataProvider="TestData")
	public void TestCase(String FirstName,String LastName,String Email,String Password,String ConfirmPassword,String Gender) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@value='"+Gender+"']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		if(driver.findElement(By.xpath("//a[@class='account']")).isDisplayed()){
			System.out.println("user is successfully logged");
		}
		else
		{
			System.out.println("user is not able to logged");
		}
		driver.close();	
}
	@DataProvider(name="TestData")
	public Object[][] datap()throws EncryptedDocumentException, IOException{
		return WorkinWithDataDrivenTest.test("Register");
	}

}



