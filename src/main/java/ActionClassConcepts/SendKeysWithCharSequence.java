package ActionClassConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String str="mahima";
		String str1="Tiwari";
		StringBuilder str2=new StringBuilder("Admin");
		StringBuffer str3=new StringBuffer("Adminbuffer");
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys(str+" "+str1+" "+str2+" "+str3+" : Testing");

	}

}
