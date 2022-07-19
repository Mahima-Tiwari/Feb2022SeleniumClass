package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggesstionList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//find total count of image
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed')]")).click();
	}

}
