package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println(driver.getTitle());
		
	}

}
