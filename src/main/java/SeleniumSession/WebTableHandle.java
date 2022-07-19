package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		String xpath="//a[contains(text(),'Joe.Root')]/parent::td/preceding-sibling::td/input";
		//driver.findElement(By.xpath(xpath)).click();
		
		//a[contains(text(),'Joe.Root')]/parent::td/following-sibling::td
		
		selectUserInWebTable("Joe.Root");
		selectUserInWebTable("Jasmine.Morgan");
		
		System.out.println(getUserDataInWebTable("Joe.Root"));
		

	}
	
	public static List<String> getUserDataInWebTable(String name) {
		System.out.println("Usr name is: "+name);
		String xpath="//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td";
		List<WebElement>colEle=driver.findElements(By.xpath(xpath));
		List<String> colList=new ArrayList<String>();
		for(WebElement e:colEle) {
			String text=e.getText();
			colList.add(text);
		}
		return colList;
	}
	
	public static void selectUserInWebTable(String name) {
		String xpath="//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
