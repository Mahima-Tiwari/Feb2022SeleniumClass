package ActionClassConcepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcepts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMeButton=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rightClickMeButton).perform();
		List<WebElement> rightList=
				driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		
		for(WebElement e:rightList) {
			System.out.println(e.getText());
			String text=e.getText();
			if(text.equals("copy")) {
				e.click();
				break;
		}
//			switch (text) {
//			Alert alert;
//			case "Edit":
//				e.click();
//				driver.switchTo().alert();
//				alert.accept();
//				break;
//
//			case "Delete":
//				e.click();
//				driver.switchTo().alert();
//				alert.accept();
//				break;
//			case "Cut":
//				e.click();
//				driver.switchTo().alert();
//				alert.accept();
//				break;
//			case "Copy":
//				e.click();
//				driver.switchTo().alert();
//				alert.accept();
//				break;
//			case "Paste":
//				e.click();
//				driver.switchTo().alert();
//				alert.accept();
//				break;
//			case "Quit":
//				e.click();
//				driver.switchTo().alert();
//				alert.accept();
//				break;
//				
//			default:
//				break;
//			}
//		}

		driver.close();
	}
	
	}

}
