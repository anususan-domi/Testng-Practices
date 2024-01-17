package day32;

import org.testng.annotations.Test;

public class FirstTestCase 
{
	@Test(priority=1)
	void logout()
	{
		System.out.println("Logout....");
	}

	@Test(priority=0)
	void openApp()
	{
		System.out.println("Opening application...");
	}
	

	@Test(priority=2)
	void login()
	{
		System.out.println("Login....");
	}
}
