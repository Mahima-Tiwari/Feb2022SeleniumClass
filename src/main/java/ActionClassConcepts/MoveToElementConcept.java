package ActionClassConcepts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how+to+create+menu+with+submenu&o=rec");
		
		WebElement contentManu=driver.findElement(By.className("menulink"));
		
		Actions act=new Actions(driver);
		act.moveToElement(contentManu).perform();
		//act.moveToElement(contentManu).build().perform();	//MULTIPLE ACTION PERFORM
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		driver.close();

	}

}
