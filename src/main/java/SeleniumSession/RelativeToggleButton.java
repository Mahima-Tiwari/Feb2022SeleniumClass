package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeToggleButton {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");// https://whenwise.com/users/3179/edit
	
		
		driver.findElement(By.id("email")).sendKeys("mahimaanimation@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123");
				
		driver.findElement(By.id("login-btn")).click();
		driver.get("https://whenwise.com/users/3179/edit");
		Thread.sleep(2500);

		WebElement ele=driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		driver.findElement(with(By.xpath("//span[@class='lever']")).toRightOf(ele)).click();
		
		
		
		

	}

}
