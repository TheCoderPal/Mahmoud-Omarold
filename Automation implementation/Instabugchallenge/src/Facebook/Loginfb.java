package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class Loginfb 
{
  @Test
  public void logintofacebook() 
  {
	    System.setProperty("webdriver.gecko.driver", "D:\\Program Files (x86)\\Selenium\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		By username = By.id("email");
		By password = By.id("pass");
		By login  =By.id("loginbutton");
		By appmenue= By.id("appsNav");
		
		
		//Mahmoud Omar Instabug Challenge
		driver.findElement(username).sendKeys("mahmoud_ynfssta_challenge@tfbnw.net");
		driver.findElement(password).sendKeys("mahmoudomarinstabug");
		driver.findElement(login).click();
		System.out.println("Logged in succesfully");
		
		
		//assertions
		boolean elememtexist= false;
		if (driver.findElements(appmenue).isEmpty())
		{
			System.out.println("Failed TC");
		}
		else
		{
			System.out.println("Passed TC");
			elememtexist= true;
			
		}
		Assert.assertTrue(elememtexist);
  }
}
