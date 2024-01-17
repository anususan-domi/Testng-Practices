package day35;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount=10)
	void mytest()
	{
		System.out.println("testing...");
	}
	
}
