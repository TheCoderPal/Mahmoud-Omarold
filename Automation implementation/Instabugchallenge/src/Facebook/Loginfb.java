package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import pages.FacebookSIpage;

public class Loginfb 
{
  @Test
  public void logintofacebook() 
  {
	    System.setProperty("webdriver.gecko.driver", "D:\\Program Files (x86)\\Selenium\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
	
		By appmenue = By.id("appsNav");
		
		FacebookSIpage.textbox_email(driver).sendKeys("mahmoud_ynfssta_challenge@tfbnw.net");
		FacebookSIpage.textbox_password(driver).sendKeys("mahmoudomarinstabug");
		FacebookSIpage.button_login(driver).click();
		//Mahmoud Omar Instabug Challenge
		
		System.out.println("===============================================");
		System.out.println("Logged in succesfully");
		
		
		//assertions
		boolean elememtexist= false;
		if (driver.findElements(appmenue).isEmpty())
		{
			System.out.println("===============================================");
			System.out.println("Failed TC");
			System.out.println("===============================================");
		}
		else
		{
			System.out.println("===============================================");
			System.out.println("Passed TC");
			System.out.println("===============================================");
			elememtexist= true;
			
		}
		System.out.println("===============================================");
		Assert.assertTrue(elememtexist);
		System.out.println("===============================================");
  }
}
