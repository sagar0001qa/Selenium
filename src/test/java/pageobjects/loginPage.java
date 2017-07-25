package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.testBase;

public class loginPage extends testBase {
	
	
	
	// all objects of login page 
	By username=By.xpath("//input[@name='userName']");
	By password=By.xpath("//input[@name='password']");
	By signup_btn=By.xpath("//input[@name='login']");
	
	// constructer 
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	// set username 
	public void setUsername(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}
	
	
	// set password 
	public void setPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	// click on sign up button 
	public void clickSignup()
	{
		driver.findElement(signup_btn).click();
	}

}
