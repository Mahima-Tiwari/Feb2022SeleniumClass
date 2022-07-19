package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcepts {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele= driver.findElement(By.linkText("Boucherville, Canada"));
		
		//right of (ele)--> tagName(p)

		String rightEle=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightEle);
		
		String leftEle=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftEle);
		
		String belowCity=driver.findElement(with(By.tagName("a")).below(ele)).getText();
		System.out.println(belowCity);
		
		String aboveCity=driver.findElement(with(By.tagName("a")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String nearCity=driver.findElement(with(By.tagName("a")).near(ele)).getText();
		System.out.println(nearCity);
	}

}
