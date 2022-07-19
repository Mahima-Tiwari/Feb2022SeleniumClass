package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser","url","headless"})
	public void setUp(String browserName, String appUrl, String headless) {
		
		System.out.println("Browser name is :  "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			if(Boolean.parseBoolean(headless)) {
				co.setHeadless(true);
			}
			driver=new ChromeDriver(co);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
						driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("please enmter correct browser name: "+browserName);
		}
		
		driver.get(appUrl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
