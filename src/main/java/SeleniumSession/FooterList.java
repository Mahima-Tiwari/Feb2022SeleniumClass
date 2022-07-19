package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//find total count of image
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footers=By.xpath("//footer//ul[@class='footer-nav']//a");
		
		clickOnElementFromSection(footers,"Leadership");
		clickOnElementFromSection(footers,"Customers");
		
	}
	
	public static void clickOnElementFromSection(By locator, String value) {
		
		List<WebElement> footerList=driver.findElements(locator);
		System.out.println(footerList.size());
				
		for(WebElement e: footerList) {
			String text=e.getText();
			System.out.println("=============="+text+"================");
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
