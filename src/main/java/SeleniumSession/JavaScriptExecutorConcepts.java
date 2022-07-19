package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.get("https://www.amazon.in/");
		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		String title= js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil JSUtil=new JavaScriptUtil(driver);
		String title=JSUtil.getTitleByJS();
		System.out.println(title);
		
//		//JSUtil.refreshBrowserByJS();
//		//JSUtil.navigateToBackPage();
		
//		WebElement logIn=driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement email=driver.findElement(By.xpath("//input[@id='input-email']"));
		
		WebElement shopByBabyAge_ele=driver.findElement(By.xpath("//h2[text()='Shop for your baby by age']"));
		
//		//JSUtil.generateAlert("Hi this is");
//		String pageText=JSUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("My Account")) {System.out.println("Pass");}
//		if(pageText.contains("Customer Service")) {System.out.println("Pass");}
//		if(pageText.contains("Recurring payments")) {System.out.println("Pass");}
		
//		JSUtil.sendKeysUsingWithId("input-email", "test123@gmail.com");
//		JSUtil.clickElementByJS(logIn);
//		
		
		JSUtil.scrollPageDown();
		Thread.sleep(1500);
		
		JSUtil.scrollPageUp();

		Thread.sleep(1500);
//		
//		JSUtil.scrollPageDown("3000");
//		
//
//		Thread.sleep(1500);
//		
//		JSUtil.scrollPageUp("2000");
		
		JSUtil.scrollIntoView(shopByBabyAge_ele);
		JSUtil.scrollIntoView(driver.findElement(By.xpath("//h2[text()='Pick up where you left off']")));
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		//driver.close();

	}

}
