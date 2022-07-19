package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void searchProductTest() {
		System.out.println("macbook");
		int i=9/0;
	}
	
	@Test(expectedExceptions=NullPointerException.class)
	public void searchProductTest1() {
		System.out.println("macbook");
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name);//NPE
	}
	
	@Test(priority=1,expectedExceptions= {ArithmeticException.class, NullPointerException.class},enabled=false)
	public void searchProductTest2() {
		System.out.println("macbook");
		int i=9/0;
		
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name);//NPE
	}
	
	//for client demo
	@Test(expectedExceptions= {Exception.class})
	public void TestingTest() {
		System.out.println("macbook");
		int i=9/0;
		
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name);//NPE
	}

}
