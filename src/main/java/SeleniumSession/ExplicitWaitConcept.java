package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By name=By.id("Form_submitForm_Name");
		By email=By.id("Form_submitForm_Email");
		By contact=By.id("Form_submitForm_Contact");
		
		waitforElementPresent(name, 10).sendKeys("Mahima");
		waitforElementPresent(email, 5).sendKeys("User@gmail.com");
		getElement(contact).sendKeys("0123698574");
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement name_ele=wait.until(ExpectedConditions.presenceOfElementLocated(name));
//		
//		name_ele.sendKeys("Mahima");
//		
//		driver.findElement(email).sendKeys("Mahima@gmail.com");
//		driver.findElement(contact).sendKeys("0788461234");
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitforElementPresent(By locator, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitforElementVisible(By locator, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
