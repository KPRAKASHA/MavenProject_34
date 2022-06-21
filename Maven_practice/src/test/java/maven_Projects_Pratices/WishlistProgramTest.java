package maven_Projects_Pratices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WishlistProgramTest extends ChromeTest{
	@Test
	public void login() {
		

		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		String Email="prakashasit17@gmail.com";
		String PWD="Prakash@17";	
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Blue and green Sneaker')])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();
		String wishlist = driver.findElement(By.className("share-label")).getText();
		if(wishlist.contains("Your wishlist URL for sharing")){
			System.out.println("Pass:items added");
		}
		
	}
}


