package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WIndow_NewWindowConcept_Selenium4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId=driver.getWindowHandle();
				
		driver.switchTo().newWindow(WindowType.WINDOW);//new feature
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);//new feature
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.close();


	}

}
