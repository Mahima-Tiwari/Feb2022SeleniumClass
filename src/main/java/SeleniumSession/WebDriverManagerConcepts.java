package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcepts {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		//validation: actual vs expected
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
	}

}
