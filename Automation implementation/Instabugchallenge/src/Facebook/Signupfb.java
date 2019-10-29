//this script is designed to fail with the wrong phone number as we can not sign up fake or specail accounts

package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import pages.FacebookSIpage;

public class Signupfb 
{
  @Test
  public void signuptofacebook() 
  {
	  //instabug friend add
	  //verycomplexpassword
	  
	    System.setProperty("webdriver.gecko.driver", "D:\\Program Files (x86)\\Selenium\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
	  
		
  
	
		FacebookSIpage.textbox_firstname(driver).sendKeys("insta");
		FacebookSIpage.textbox_surname(driver).sendKeys("bug");
		FacebookSIpage.textbox_mobilenumber(driver).sendKeys("01888477545");
		FacebookSIpage.textbox_passwordsu(driver).sendKeys("verycomplexpassword");
		
		FacebookSIpage.dropdown_day(driver).click();
		
		Select selday = new Select(FacebookSIpage.dropdown_day(driver));
		selday.selectByIndex(22);
		
		FacebookSIpage.dropdown_month(driver).click();
		
		Select selmon = new Select (FacebookSIpage.dropdown_month(driver));
		selmon.selectByIndex(1);
		
		FacebookSIpage.dropdown_year(driver).click();
		
		
		Select selyear = new Select (FacebookSIpage.dropdown_year(driver));
		selyear.selectByValue("2006");
		
		FacebookSIpage.radiobutton_male(driver).click();
		
		FacebookSIpage.button_signup(driver).click();
		
		
		
		//assertion that error massage appeared
		boolean elememtexist= false;
		if (driver.getPageSource().contains("Please enter a valid mobile number or email address."))
		{
			System.out.println("Passed TC");
			elememtexist= true;
			
		}
		else
		{
			System.out.println("Failed TC");
			
		}
		Assert.assertTrue(elememtexist);
		
  }
}
