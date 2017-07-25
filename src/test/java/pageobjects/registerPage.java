package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.testBase;

public class registerPage extends testBase {
	
	
	
	// find all objects 
	By reglink=By.xpath("//a[.='REGISTER']");
	By username=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='password']");
	By confirmPassword=By.xpath("//input[@name='confirmPassword']");
	By signUpBtn1=By.xpath("//input[@name='register']");
		
	
	
	public registerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void regLink()
	{
		driver.findElement(reglink).click();
	}
	
	public void setUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void setConfirmPassword(String cpass)
	{
		driver.findElement(confirmPassword).sendKeys(cpass);
	}
	
	public void clickOnSign()
	{
		driver.findElement(signUpBtn1).click();
	}
	
		}
