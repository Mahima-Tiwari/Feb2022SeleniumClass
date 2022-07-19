package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcepts {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("mahima@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//		
		//2.
//		WebElement emailId=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
//		
//		emailId.sendKeys("mahima@gmail.com");
//		password.sendKeys("Test@123");
//		loginBtn.click();
//		//log OUT & LogIN
		
		//3.By locator approach
		
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		By loginBtn=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");	
//		
//		WebElement email_ele=driver.findElement(emailId);
//		WebElement passswd_ele=driver.findElement(password);
//		WebElement logInBtn_ele=driver.findElement(loginBtn);
//		
//		
//		email_ele.sendKeys("mahima@gmail.com");
//		passswd_ele.sendKeys("Test@123");
//		logInBtn_ele.click();
		
		//4. By locator with a generic method:getElement()
		
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		By loginBtn=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");	
//		
//		getElement(emailId).sendKeys("mahima@gmail.com"");
//		getElement(password).sendKeys("Test@123");
//		getElement(loginBtn).click();
		
		//5. By locator OR with a generic method: getElement() and action method like doSendKeys()

//
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		By loginBtn=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");	
//		
//		doSendKeys(emailId,"mahima@gmail.com");
//		doSendKeys(password,"Test@123");
//		doClick(loginBtn);
		
		//6.By locator OR with a generic method in ElementUtil class 
		
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		By loginBtn=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");	
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "mahima@gmail.com");
//		eleUtil.doSendKeys(password, "Test@123");
//		eleUtil.doClick(loginBtn);
		
		// 7. String locator OR with generic methods in ElementUtil class
		String email_id= "input-email";
		String password_id="input-password";
		String login_id="#content > div > div:nth-child(2) > div > form > input";
		
		doSendKeys(getBy("id", email_id), "mahima@gmail.com");
		doSendKeys(getBy("id", password_id), "Test@123");
		System.out.println("inside 7th string locator");
		//doClick(getBy("id", login_id));
		
		
}
	private static void doClick(String string, String login_id) {
		// TODO Auto-generated method stub
		
	}
	public static By getBy(String locatorType, String locatorValue) {
//		By locator=By.id(locatorValue);
//		return locator;
		By locator=null;
		
		switch (locatorType.toLowerCase()) {
		case "id":
			locator=By.id(locatorValue);
			break;

		default:
			System.out.println("please pass correct locator"+locatorValue);
			break;
		}
		return locator;
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) 
	{
	return driver.findElement(locator);
		
	}
		
}
