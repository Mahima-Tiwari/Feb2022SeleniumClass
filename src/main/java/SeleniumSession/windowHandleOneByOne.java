package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandleOneByOne {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String parentWindowId=driver.getWindowHandle();
		
		By twitterLocator=By.xpath("//img[@alt='OrangeHRM on twitter']");
		By linkdinLocator=By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By faceBookinLocator=By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By youTubeLocator=By.xpath("//img[@alt='OrangeHRM on youtube']");
		
		doHandleWindow(twitterLocator);
		doHandleWindow(linkdinLocator);
		doHandleWindow(faceBookinLocator);
		doHandleWindow(youTubeLocator);
		
		
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
//		Set<String> handles=driver.getWindowHandles();
//		Iterator<String> it=handles.iterator();
//		String parentWindowId=it.next();
//		String childWindowId=it.next();
//		driver.switchTo().window(childWindowId);
//		System.out.println("window title is: "+driver.getTitle());
//		driver.close();
//		driver.switchTo().window(parentWindowId);
//		
//		

	}
	public static void doHandleWindow(By locator) {
		driver.findElement(locator).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		String childWindowId=it.next();
		driver.switchTo().window(childWindowId);
		System.out.println("window title is: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: "+driver.getTitle());
		
	}

}
