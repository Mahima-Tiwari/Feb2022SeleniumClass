package PopUp_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSPopUpHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		//alert.sendKeys("admin");
		alert.accept();
		//alert.dismiss();
		
		
	}

}
