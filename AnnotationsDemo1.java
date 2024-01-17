package day33;

import org.testng.annotations.*;


/*
 * 1) Login -- @BeforeMethod
2) Search   --- @Test
3) Logout --  @AfterMethod
4) Login
5) Advsearch---  @Test
6) Logout

 * 
 */
public class AnnotationsDemo1 {

	@BeforeMethod
	void login()
	{
		System.out.println("Login......");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout....");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search... ");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("advanced search...");
	}
	
	
	
}
