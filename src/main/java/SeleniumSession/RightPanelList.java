package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightPanelList {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//find total count of image
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		By rightPanel=By.xpath("//aside[@id='column-right']//a");
		
//		List<WebElement> rightPanelList= driver.findElements(rightPanel);
//		
//		for(WebElement e : rightPanelList) {
//			String text=e.getText();
//			System.out.println(text);
//			
//			if(text.equals("Register")) {
//				e.click();
//			}
//			
//		}
		
		//getAllElementsText(rightPanel);
		
		List<String> acteEleTextList=getElementsTextList(rightPanel);
		
		System.out.println(acteEleTextList);
		
		if(acteEleTextList.contains("Register")) System.out.println("PASS");
		
	}
	
	
	
	public static int getElementsListCount(By locator) {
		return driver.findElements(locator).size();
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList=new ArrayList<String>();
		
		List<WebElement> elementList= driver.findElements(locator);
		
		for (WebElement e : elementList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	public static void getAllElementsText(By locator) {
		
		List<WebElement> elementList= driver.findElements(locator);
		
		for (WebElement e : elementList) {
			String text=e.getText();
			System.out.println(text);
		}
	}

}
