package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartAppTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println("");
	}
	
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		System.out.println("title is:  "+title);
		
		Assert.assertEquals(title, "Account Login1");
	}
	@Test
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println("url is:  "+url);
		Assert.assertTrue(url.contains("route=account/login"));
	}
	
	@Test
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='search']")).isDisplayed());
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
