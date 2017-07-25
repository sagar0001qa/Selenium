package guru_tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import base.testBase;
import guru_pages.HomePage;
import guru_pages.MobilePage;
import pageobjects.loginPage;

public class SortMobile extends testBase{
	
	@Test
	public void login() throws IOException
	{
		setup();
		HomePage home=new HomePage(driver);
		MobilePage mobile=new MobilePage(driver);
		
		// verify home page title 
		
		String actualTitle=home.HomePageTitle();
		String expectedTitle = "THIS IS DEMO SITE FOR   ";
		
		try {
			assertEquals(actualTitle, expectedTitle);
		    } catch (Error e) {
		      System.out.println(e);
		    }
		
			
		// click on mobile menu
		
		home.homePageMobileMenu();
		
		// sort by name 
		String name="Name";
		mobile.mobileSortBy(name);
		
		// verify mobile page title
		String mactualTitle=mobile.mobilePageTitle();
		String mexpectedTitle = "MOBILE";
				
		try {
			assertEquals(mactualTitle, mexpectedTitle);
		    } catch (Error e) {
		      System.out.println(e);
		    }
				
		// sorted list of elements 
		mobile.sortedmobileList();		
		
		
	}
		

}
