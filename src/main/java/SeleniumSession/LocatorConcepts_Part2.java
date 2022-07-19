package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts_Part2 {
	
	static WebDriver driver;

	public static void main(String[] args) {


		//1.id-->unique
		//2. name--> can be duplicate
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Test@gmail.com");
//		
	
//		By email=By.name("email");
//		By paswd=By.name("password");
//		By loginBtn=(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(email, "mahima@gmail.com");
//		eleUtil.doSendKeys(paswd, "Test@gmail.com");
//		eleUtil.doClick(loginBtn);
		
		//3. class name-->can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("mahima");
		
		//4. xpath--> is locator (address of the element in DOM) --but its not an attribute
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("mahima@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
//		By emailId=By.xpath("//*[@id=\"input-email\"]");
//		By paswd=By.xpath("//*[@id=\"input-password\"]");
//		By logINBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		By errMsg=By.className("alert-danger");
//		
//		
//		doSendKeys(emailId, "mahima@gmail.com");
//		doSendKeys(paswd, "Test@gmail.com");
//		doClick(logINBtn);
////		String errText=driver.findElement(errMsg).getText();
////		System.out.println(errText);
//		
//		String actErrMsg=doElementText(errMsg);
//		if(actErrMsg.contains("Warning")) {
//			System.out.println("correct error message");
//		}
//		else {
//			System.out.println("incorrect error msg");
//		}
		
		
		//5. cssSelector: is a locator but it is not an attribute
		driver.findElement(By.cssSelector("#input-email")).sendKeys("mahima@");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		//6. linkText: only for link
//		driver.findElement(By.linkText("Register")).click();
////		
//		By registerLink=By.linkText("Register");
//		By loginLink=By.linkText("Login");
//		getElement(registerLink).click();
//		getElement(loginLink).click();
		
		//7. PartialLinkText: is only for links
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		
		//8.tagName
		
		String header=driver.findElement(By.tagName("h1")).getText();		
		System.out.println(header);
		
	}
	
	public static String doElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
