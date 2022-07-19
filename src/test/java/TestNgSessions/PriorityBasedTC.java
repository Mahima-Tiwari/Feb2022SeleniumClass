package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityBasedTC {
	
	@Test(priority=5)
	public void aTest() {
		System.out.println("5 A test");
	}
	@Test(priority=3)
	public void bTest() {
		System.out.println("3 B test");
	}
	@Test(priority=1)
	public void cTest() {
		System.out.println("1--C test");
	}
	@Test(priority=2)
	public void dTest() {
		System.out.println("2 D test");
	}
	@Test(enabled=false, priority=3)
	public void eTest() {
		System.out.println("E test");
	}
	@Test(priority=4)
	public void fTest() {
		System.out.println("4 F test");
	}

}
