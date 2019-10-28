package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

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
	  
		
		By firstanme = By.id("u_0_m");
		By surname = By.id("u_0_o");
		By mobilenumber = By.id("u_0_r");
		By passwordfield = By.id("u_0_y");
		By dayfield = By.id("day");
		By monthfield = By.id("month");
		By yearfield = By.id("year");
		By malechoice = By.id("u_0_7");
		By femalechoice = By.id("u_0_9");
		By customchoice = By.id("u_0_b");
		By signupbtn = By.xpath(".//*[@id='u_0_15']");
	
		
		driver.findElement(firstanme).sendKeys("insta");
		driver.findElement(surname).sendKeys("bug");
		driver.findElement(mobilenumber).sendKeys("01888477545");
		driver.findElement(passwordfield).sendKeys("verycomplexpassword");
		
		driver.findElement(monthfield).click();
		Select selmon = new Select (driver.findElement(monthfield));
		selmon.selectByIndex(1);
		
		driver.findElement(dayfield).click();
		Select selday = new Select (driver.findElement(dayfield));
		selday.selectByIndex(22);
		
		driver.findElement(yearfield).click();
		Select selyear = new Select (driver.findElement(yearfield));
		selyear.selectByValue("1995");
		
		driver.findElement(malechoice).click();
		
		driver.findElement(signupbtn).click();
		
		
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
