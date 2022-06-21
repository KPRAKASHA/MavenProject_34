package maven_Projects_Pratices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WorkingOnDropdownTest {
	@Test
	public void DropdownClick(){
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')][1]")).click();
	    WebElement ele=driver.findElement(By.id("products-orderby"));
	   ele.sendKeys(Keys.CONTROL.ARROW_DOWN);
	   WebElement ele1=driver.findElement(By.id("products-orderby"));
		ele1.sendKeys(Keys.ENTER);
		driver.close();
		
	}
	

}
