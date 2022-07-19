package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmAppTest extends BaseTest{
	
	//https://www.orangehrm.com/orangehrm-30-day-trial

	@Test(priority=1)
	public void hrmtitleTest() {
		
		String title=driver.getTitle();
		System.out.println("title is:  "+title);
		
		Assert.assertTrue(title.contains("OrangeHRM1"));
	}
	@Test(priority=2)
	public void hrmUrlTest() {
		String url=driver.getCurrentUrl();
		System.out.println("url is:  "+url);
		Assert.assertTrue(url.contains("/orangehrm-30-day-trial"));
	}

	@Test(priority=3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
	}


	
}
