package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTogether {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles=driver.getWindowHandles();		
		Iterator<String> it=handles.iterator();
		
		while(it.hasNext()){
			String windowId= it.next();
			if(!windowId.equals(parentWindowId)) {
			driver.switchTo().window(windowId);
			System.out.println("window title is: "+driver.getTitle()+": Url is: "+driver.getCurrentUrl());
			driver.close();
			}

		}
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: "+driver.getTitle());
		driver.close();

	}

}
