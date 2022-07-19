package PopUp_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_ImageFrameFormFilling {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//img[@class='templates__hero-illustration hidden-sm hidden-md hidden-lg']")).click();
		driver.findElement(By.cssSelector("#imageTemplateContainer > img")).click();
		System.out.println("clicked");
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2020");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Ford");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("modal1");
		
		By state=By.id("RESULT_RadioButton-12");
		
		
		Select select=new Select(driver.findElement(state));
		
		select.selectByIndex(2);
		select.selectByValue("Radio-4");
		
		
		

	}

}
