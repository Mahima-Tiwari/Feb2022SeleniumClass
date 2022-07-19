package TestNgSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount=10)
	public void createUserTest() {
		System.out.println("create user test");
		//int i=9/0;
	}

}
