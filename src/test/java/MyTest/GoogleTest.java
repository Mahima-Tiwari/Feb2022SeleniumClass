package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	
	@Test(priority=1)
	public void googleTitleTest() {
	
		Assert.assertEquals(driver.getTitle(), "Google1");
	}
	
	@Test(priority=2)
	public void googleUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}


}
