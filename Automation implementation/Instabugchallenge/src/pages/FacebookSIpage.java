//pom we kda
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSIpage 
{
	private static WebElement element = null;
	
	public static WebElement textbox_email(WebDriver driver)
	{
		element  = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement textbox_password(WebDriver driver)
	{
		element  = driver.findElement(By.id("pass"));
		return element;
	}
	
	public static WebElement button_login(WebDriver driver)
	{
		element  = driver.findElement(By.id("loginbutton"));
		return element;
	}
	
	public static WebElement textbox_firstname(WebDriver driver)
	{
		element  = driver.findElement(By.id("u_0_m"));
		return element;
	}
	
	public static WebElement textbox_surname(WebDriver driver)
	{
		element  = driver.findElement(By.id("u_0_o"));
		return element;
	}
	
	public static WebElement textbox_mobilenumber(WebDriver driver)
	{
		element  = driver.findElement(By.id("u_0_r"));
		return element;
	}
	
	public static WebElement textbox_passwordsu (WebDriver driver)
	{
		element  = driver.findElement(By.id("u_0_y"));
		return element;
	}
	
	
	public static WebElement dropdown_day(WebDriver driver)
	{
		element  = driver.findElement(By.id("day"));
		return element;
	}
	
	public static WebElement dropdown_month(WebDriver driver)
	{
		element  = driver.findElement(By.id("month"));
		return element;
	}
	
	public static WebElement dropdown_year(WebDriver driver)
	{
		element  = driver.findElement(By.id("year"));
		return element;
	}
	
	public static WebElement radiobutton_male(WebDriver driver)
	{
		element  = driver.findElement(By.xpath(".//*[@id=\"u_0_7\"]"));
		if (element != null)
		{
			System.out.println("male located and will be selected succesfully ");
			return element;
		}
		else
		{
			System.out.println("can not find the male radio button because the id is changed ");
			element  = driver.findElement(By.xpath(".//*[@id='u_0_15']"));  
		return element;
		}
	}
	
	public static WebElement button_signup(WebDriver driver)
	{
		element  = driver.findElement(By.xpath(".//*[@id='u_0_15']"));
		return element;
	}
	
	

	

	
}
