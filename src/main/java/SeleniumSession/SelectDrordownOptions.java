package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDrordownOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		//dropdown
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By country= By.id("Form_submitForm_Country");
		By state= By.id("Form_submitForm_State");
		
//		printSelectDropDownValues(country);
//		selectValueFromSelectDropDown(country, "India");
//		Thread.sleep(5000);
//		selectValueFromSelectDropDown(state, "Goa");
		
		if( getSelectDropDownValuesList(country).contains("India")){
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		List<String> countryList= getSelectDropDownValuesList(country);
		if(countryList.contains("India")) System.out.println("Pass");
		if(countryList.contains("Brazil")) System.out.println("Pass");
		if(countryList.contains("Angola")) System.out.println("Pass");
		if(countryList.contains("Indian")) System.out.println("Pass");
		
		
//		Select select=new Select(driver.findElement(country));
//		Select select1=new Select(driver.findElement(state));
//		
//		List <WebElement> countryOptions=select.getOptions();
//		System.out.println(countryOptions.size());
//		
//		for (WebElement e: countryOptions) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
	}
	
	public static WebElement getElement(By locator) 
	{
	return driver.findElement(locator);
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int printSelectDropDownValuesCount(By locator) {
		return getElements(locator).size(); 
	}
	
	public static void selectValueFromSelectDropDown(By locator, String values) {
		
		Select select=new Select(getElement(locator));
		List <WebElement> dropDownOptions=select.getOptions();
		System.out.println(dropDownOptions.size());
		
		for (WebElement e: dropDownOptions) {
			String text=e.getText();
			if(text.contains(values)) {
				e.click();
				break;
			}
		}
		
	}
	
	public static List<String> getSelectDropDownValuesList(By locator) {
		List <String> valuesList= new ArrayList<String>();
		Select select=new Select(getElement(locator));
		List <WebElement> dropDownOptions=select.getOptions();
		System.out.println(dropDownOptions.size());
		
		for (WebElement e: dropDownOptions) {
			String text=e.getText();
			valuesList.add(text);
			}
		return valuesList;
		
		
	}
	
	public static void printSelectDropDownValues(By locator) {
		Select select=new Select(getElement(locator));
		List <WebElement> dropDownOptions=select.getOptions();
		System.out.println(dropDownOptions.size());
		
		for (WebElement e: dropDownOptions) {
			String text=e.getText();
			System.out.println(text);
					}
		
	}
}
