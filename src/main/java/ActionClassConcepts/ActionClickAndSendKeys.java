package ActionClassConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
//		WebElement fullName=driver.findElement(By.id("Form_submitForm_Name"));
		
		By fullName=By.id("Form_submitForm_Name");
		By email=By.id("Form_submitForm_Email");
		By careers=By.linkText(" Careers");
		By aboutUs=By.linkText("About Us");
		
		doActionsSendKeys(fullName, "Mahima");
		doActionsSendKeys(email, "mahima@gmail");
		doActionsCick(careers);
		
	Actions act=new Actions(driver);
//		act.sendKeys(fullName, "Mahima").perform();
	//	act.doubleClick(driver.findElement(aboutUs));
	

	}
	
	public static WebElement getElement(By locator) 
	{
	return driver.findElement(locator);
		
	}
	public static void doActionsCick(By locator) {
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator) , value).perform();
		
	}
	
	
	
	
	
	
	
	

}
