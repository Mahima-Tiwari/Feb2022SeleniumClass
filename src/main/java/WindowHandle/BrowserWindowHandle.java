package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println("parent window id is: "+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child window id is: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		//driver.switchTo().window(childWindowId9);
		System.out.println("Child window title is: "+driver.getTitle());
		
		driver.close();
		//driver.quit();//closes all the windows
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window titile is: "+driver.getTitle());
		
		//youtube window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> youtubeWindowHandles=driver.getWindowHandles();
		Iterator<String> youTubeIT=youtubeWindowHandles.iterator();
		youTubeIT.next();
		String youTubeWindowId=youTubeIT.next();
		
		driver.switchTo().window(youTubeWindowId);
		System.out.println("youtube window id is: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
