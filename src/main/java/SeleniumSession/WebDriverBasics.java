package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SELENIUM\\chromedriver.exe");
		
		//automation steps:
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
