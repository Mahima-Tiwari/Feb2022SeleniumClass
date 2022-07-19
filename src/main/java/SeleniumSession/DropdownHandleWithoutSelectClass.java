package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		//dropdown.---html tag--has--select
		//but can't use select class
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By country=By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		selectValueFromDropDown(country, "India");

//		List<WebElement> countryOptions=driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//		
//		System.out.println(countryOptions.size());
//		
//		for(int i=0; i<countryOptions.size();i++) {
//			String text=countryOptions.get(i).getText();
//			System.out.println(text);
//			
//			if(text.contains("India")) {
//				countryOptions.get(i).click();
//				break;
//			}
		}
		
	public static void  selectValueFromDropDown(By locator, String Value) {
		
List<WebElement> ListOptions= driver.findElements(locator);
		System.out.println(ListOptions.size());
		
		for(int i=0; i<ListOptions.size();i++) {
			String text=ListOptions.get(i).getText();
			System.out.println(text);
			
			if(text.contains(Value)) {
				ListOptions.get(i).click();
				break;
			}
		
	}

}
		
	}
	

