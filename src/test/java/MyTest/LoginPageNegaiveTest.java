package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegaiveTest extends BaseTest{
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			{"test@1234","test2323423"},
			{"mahima@gmail.com","test2323423"},
			{"test@   @1234","test232342jjnj3"},
			{"   ","    "},
			{"!#$%^&@","test2323423"}
		};
	}
	
	@Test(dataProvider="getLoginData")
	public void loginWithWrongDataTest(String userName, String password) {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMsg=
				driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println("error msg is: "+errorMsg);
		
		Assert.assertTrue(errorMsg.contains("Warning: No match for E-Mail Address and/or Password"));
	}

}
