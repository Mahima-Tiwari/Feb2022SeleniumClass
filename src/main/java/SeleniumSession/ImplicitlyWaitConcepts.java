package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcepts {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Mahima");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("Mahima@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("0788461234");
		
		//homepage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}

}
