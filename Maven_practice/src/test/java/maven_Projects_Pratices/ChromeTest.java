package maven_Projects_Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {
	WebDriver driver;
  @BeforeClass
 public void OpenBroweser(){
	 System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	 
 }
 @AfterClass
    public void close(){
	 driver.close();
 }

}
