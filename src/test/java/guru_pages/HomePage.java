package guru_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.testBase;

public class HomePage extends testBase {
	
	
	// find all objects 
	By homePageTitle=By.xpath("//h2[contains(text(),'demo')]");
	By homePageMobileMenu=By.xpath("//a[contains(text(),'Mobile')]");
	By homePageTVMenu=By.xpath("//a[contains(text(),'TV')]");
	
	By sonyMobileCost=By.xpath("//a[contains(text(),'Sony Xperia')]/../../div[1]/span/span");	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String HomePageTitle()
	{
		String HomePageTitle=driver.findElement(homePageTitle).getText();
		return HomePageTitle;
	}
	
	public void homePageMobileMenu()
	{
		driver.findElement(homePageMobileMenu).click();
	}
	
	public void homePageTVMenu()
	{
		driver.findElement(homePageTVMenu).click();
	}
	public String sonyMobileCost()
	{
		String sonyMobileCost1=driver.findElement(sonyMobileCost).getText();
		return sonyMobileCost1;
	}
	
	
	
}

