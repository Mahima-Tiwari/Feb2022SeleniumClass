package ActionClassConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		By id=By.id("email");
		By passwd=By.id("passwd");
		By search=By.id("search_query_top");
		
		driver.findElement(id).sendKeys("Mahima");
		driver.findElement(passwd).sendKeys("Admin");
		driver.findElement(passwd).submit(); //<form> tag should be there then only submit works
		
		driver.findElement(search).sendKeys("pretty dress");
		driver.findElement(search).submit();
		

	}

}
