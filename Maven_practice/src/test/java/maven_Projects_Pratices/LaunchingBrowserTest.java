package maven_Projects_Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingBrowserTest {
	@Test
	public void TC(){
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.close();
	}

}
