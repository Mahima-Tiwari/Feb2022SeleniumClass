package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MSEdgeLaunch {

	public static void main(String[] args) {
		
		
				WebDriverManager.edgedriver().setup();
				
				WebDriver driver=new EdgeDriver();
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
