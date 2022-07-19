package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeCOncepts {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		String placeEmail=driver.findElement(By.id("Form_submitForm_Email")).getAttribute("placeholder");
		System.out.println(placeEmail);
		
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("mahima");
		String value=driver.findElement(By.id("Form_submitForm_FirstName")).getAttribute("value");
		System.out.println(value);
		
		By phoneNumber=By.id("Form_submitForm_Contact");
		By lastName=By.id("Form_submitForm_LastName");
		
		System.out.println(doGetAttributeValue(phoneNumber, "placeholder"));
		System.out.println(doGetAttributeValue(lastName, "name"));

		if(doIsDisplayed(lastName)) {
			System.out.println("true");
		}
		
	}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}
	
	public static String doGetAttributeValue(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	public static WebElement getElement(By locator) 
	{
	return driver.findElement(locator);
		
	}

}
