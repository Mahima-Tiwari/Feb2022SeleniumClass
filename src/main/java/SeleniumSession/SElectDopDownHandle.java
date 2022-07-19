package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SElectDopDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		//dropdown.---html tag----select
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By country= By.id("Form_submitForm_Country");
		WebElement eleCountry=driver.findElement(country);
//		
//		Select select=new Select(eleCountry);
//		select.selectByIndex(5);
//		select.selectByVisibleText("Belgium");
//		select.selectByValue("India");
		
		By state= By.id("Form_submitForm_State");
		WebElement eleState=driver.findElement(state);
		
//		Thread.sleep(5000);
//		Select select1=new Select(eleState);
//		select1.selectByIndex(2);
//		select1.selectByVisibleText("Goa");
	
//		//select.selectByValue("Brazil");
		
		doSelectDropDownByIndex(country, 2);
		doSelectDropDownByValue(country, "India");
		Thread.sleep(5000);
		doSelectDropDownByValue(state, "Goa");
		
		doSelectDropDownByVisibleText(country, "India");
		Thread.sleep(5000);
		doSelectDropDownByVisibleText(state, "Goa");
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select =new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select =new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select =new Select(getElement(locator));
		select.selectByVisibleText(text);;
		
	}
	
	public static WebElement getElement(By locator) 
	{
	return driver.findElement(locator);
		
	}

}
