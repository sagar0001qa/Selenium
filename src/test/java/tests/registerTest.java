package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base.testBase;
import pageobjects.registerPage;

public class registerTest extends testBase {
	
	@Test
	public void register() throws IOException
	{
		
		registerPage reg=new registerPage(driver);
		reg.regLink();
		reg.setUsername("test");
		reg.setPassword("test");
		reg.setConfirmPassword("test");
		reg.clickOnSign();
		
		driver.quit();
		
	
	}
	
	
	
	

}
