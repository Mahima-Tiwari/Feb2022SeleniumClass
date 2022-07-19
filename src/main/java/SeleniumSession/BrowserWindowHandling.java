package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		//window handleer api
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWindowId=it.next();		
		System.out.println("parent window"+parentWindowId);
		
		String childWindowId=it.next();		
		System.out.println("child window"+childWindowId);
		
		//switch to child window		
		driver.switchTo().window(childWindowId);		
		System.out.println("child window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("title is:"+driver.getTitle());
		
	}

}
