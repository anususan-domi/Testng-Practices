package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 1) open app
 * 2) logo presence
 * 3) login
 * 4) close
 * 
 */
public class OrangehrmTests {
	WebDriver driver;
	
	@Test(priority=4)
	void closeApp()
	{
	driver.quit();	
	}
	
	
	@Test(priority=2)
	void testLogo()
	{
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
				
	}
	
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	

	@Test(priority=0)
	void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
}
