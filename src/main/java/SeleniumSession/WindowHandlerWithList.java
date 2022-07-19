package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
			
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	
		Set<String> handles=driver.getWindowHandles();	
		List<String> windowList=new ArrayList<String>(handles);
		String parentWindowId=windowList.get(0);
		String childWindowId=windowList.get(1);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
		
		

	}

}
