package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//find total count of image
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		List<WebElement> imageList=driver.findElements(By.tagName("img"));
//		System.out.println("total image: "+imageList.size());
//		
//		//webscrapping: capturing data from attribute
//		
//		for(WebElement e:imageList) {
//			System.out.println(e.getAttribute("src"));
//			System.out.println(e.getAttribute("alt"));
//			System.out.println(e.getAttribute("height"));
//		}
		
		By images=By.tagName("img");
		By links=By.tagName("a");
		int linksCount=getElementsCount(links);
		int imagesCount=getElementsCount(images);
		
		System.out.println(linksCount+ ": "+imagesCount);

	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
