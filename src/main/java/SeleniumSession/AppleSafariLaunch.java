package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AppleSafariLaunch {

	public static void main(String[] args) {

		//there is no exe file for safari
		WebDriver driver=new SafariDriver();
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
