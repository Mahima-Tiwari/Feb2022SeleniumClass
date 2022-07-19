package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/sunrisers-hyderabad-vs-chennai-super-kings-46th-match-1304092/full-scorecard");
		
		Thread.sleep(13000);
		
//		Alert alert= driver.switchTo().alert();
//		alert.dismiss();
		
//		String text=driver.findElement(By.xpath("//span[contains(text(),'MS Dhoni')]//ancestor::td")).getText();
//		System.out.println(text);
		
		System.out.println(getWicketTakerName("MS Dhoni"));
		System.out.println(getPlayerScoreList("MS Dhoni"));
		

	}
	
	public static List<String> getPlayerScoreList(String playerName) {
		String sc_xpath="//table[contains(@class,'ci-scorecard-table')]//span[contains(text(),'"+playerName+"')]//ancestor::td/following-sibling::td";
		List<WebElement> scoreList=driver.findElements(By.xpath(sc_xpath));
		List<String> scoreVaList=new ArrayList<String>();
		for(WebElement e:scoreList) {
			String text=e.getText();
			scoreVaList.add(text);
		}
		return scoreVaList;
	}
	
	public static String getWicketTakerName(String playerName) {
		String wk_xpath="//span[contains(text(),'"+playerName+"')]//ancestor::td/following-sibling::td";
		return driver.findElement(By.xpath(wk_xpath)).getText();
	}

}
