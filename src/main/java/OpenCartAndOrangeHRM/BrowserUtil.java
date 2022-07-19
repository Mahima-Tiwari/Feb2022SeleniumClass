package OpenCartAndOrangeHRM;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import SeleniumSession.Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util{
	
	public WebDriver driver;
	
	public WebDriver init_driver(String browserName) {
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();			
			break;
		case "FireFOX_BROWSER":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();			
			break;
			
		case "EDGE_BROWSER":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();			
			break;

		default:
			System.out.println("Please pass correct driver"+browserName);
			break;
		}
		return driver;
	}

	@Override
	public void navigateUrl(String url) {
		
		if(url==null) {
			return;
		}
		if (url.isEmpty()) {
			return;
		}
		if(url.indexOf("http")<0 || url.indexOf("https")<-1) {
			System.out.println("please pass correct url, http(s) is missing"+url);
			return;
		}

		driver.get(url);		
	}

	@Override
	public void navigateUrl(URL url) {
		
		driver.navigate().to(url);
	}

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getPageUrl() {
		
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		
		return driver.getPageSource();
	}

	@Override
	public void closeBrowser() {
		
		driver.close();
		
	}

	@Override
	public void quitBrowser() {
		driver.quit();
	}
	
	

}
