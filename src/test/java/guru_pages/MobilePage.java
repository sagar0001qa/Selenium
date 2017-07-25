package guru_pages;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.testBase;

public class MobilePage extends testBase{
	
	// find all objects 
		By mobilePageTitle=By.xpath("//h1[contains(text(),'Mobile')]");
		By mobileSortBy=By.xpath("//select[@title='Sort By']");
		By sortedmobileList=By.xpath("//li[@class='item last']/a");
		
		// Mobile details page
		By mobilePriceOndetails=By.xpath("//span[@class='price']");
		
		public MobilePage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		public String mobilePageTitle()
		{
			String mobilePageTitle1=driver.findElement(mobilePageTitle).getText();
			return mobilePageTitle1;
		}
		
		public void mobileSortBy(String sortValue)
		{
			org.openqa.selenium.support.ui.Select dropdown=new org.openqa.selenium.support.ui.Select(driver.findElement(mobileSortBy));	
			dropdown.selectByVisibleText(sortValue);	
		}
			
		public void sortedmobileList()
		{			
			
			List<WebElement> allOptions = driver.findElements(sortedmobileList);
			System.out.println("The Sorted list of Mobile is:");
			for (WebElement e : allOptions) {
				System.out.println(e.getAttribute("title"));
				
							}
			
			}
			
		public void clickOnMobile(String mobileName)
		{			
			
			List<WebElement> allOptions = driver.findElements(sortedmobileList);
			for (WebElement e : allOptions) {
				if(e.getAttribute("title").contains(mobileName))
				{
					e.click();
				}
				
				}
		}
		
		
		// Mobile details page 
		
		public String mobilePriceOndetails()
		{
			String mobilePriceOndetails1=driver.findElement(mobilePriceOndetails).getText();
			return mobilePriceOndetails1;
		}
		
		
		
}
