package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser { //no browser ie browser ll not be launched and not be visible

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//co.setHeadless(true);
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
