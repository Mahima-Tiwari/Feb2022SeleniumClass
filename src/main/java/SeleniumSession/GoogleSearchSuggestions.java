package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//find total count of image
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		Thread.sleep(3000);
	List<WebElement> suggList= 
				driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
	System.out.println(suggList.size());
	
	for(WebElement e: suggList) {
		String text=e.getText();
		System.out.println(text);
		if(text.contains("naveen automationlabs java")) {
			e.click();
			break;
		}
	}
	
		
		
		
		

	}

}
