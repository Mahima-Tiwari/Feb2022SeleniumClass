package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class PaginationWebTable {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("https://selectorshub.com/xpath-practice-page/");
			
			while(true) {
			if(driver.findElements(By.xpath("//td[text()='Siliguri']")).size()>0) {
				//selectCity("Bengaluru");
				selectCityWithRelative("Siliguri");
				break;
			}
			else {
				WebElement next=driver.findElement(By.linkText("Next"));
				
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination is over...city is not found");
					break;
				}
				next.click();
				Thread.sleep(2000);
			}
			
			}

	}
	
	public static void selectCity(String cityName) {
		String check_Xpath="//td[text()='"+cityName+"']//preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(check_Xpath)).click();
	}

	public static void selectCityWithRelative(String cityName) {
		WebElement ele = driver.findElement(By.xpath("//td[text()='"+cityName+"']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();
	}
}
