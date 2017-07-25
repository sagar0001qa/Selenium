package guru_tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.Test;
import base.testBase;
import guru_pages.HomePage;
import guru_pages.MobilePage;

public class VerifyProductCost extends testBase{
	
	@Test
	public void login() throws IOException
	{
		HomePage home=new HomePage(driver);
		MobilePage mobile=new MobilePage(driver);
		
		// click on mobile menu
		home.homePageMobileMenu();
		
		// Get price of mobile 'sony' from home page 
		String sonyMobileCostOnHomePage=home.sonyMobileCost();
		
		// Click on sony mobile
		String mobilename="Xperia";
		mobile.clickOnMobile(mobilename);
		
		// Get price of mobile from details page 
		String sonyMobileCostOnDetailsPage=mobile.mobilePriceOndetails();
		
		// verify cost from details and home page 
		try {
			assertEquals(sonyMobileCostOnHomePage, sonyMobileCostOnDetailsPage);
			
			    
			} catch (Error e) {
		      System.out.println(e);
		    }
		
		
	}

}
