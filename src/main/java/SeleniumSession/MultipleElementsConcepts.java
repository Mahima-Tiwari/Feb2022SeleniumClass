package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsConcepts {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//links -->   <a>
		//find out total no of links on page--print count of links
		//print text of each link on console
		//Ignore those links which are having empty text or no text
		//find href value for all links
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//links-->a
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		System.out.println("total links"+linksList.size());
		
//		for (int i=0;i<linksList.size();i++) {
//			String text=linksList.get(i).getText();
//			String href=linksList.get(i).getAttribute("href");
//			if(!text.isEmpty()) {
//				System.out.println(text+":"+href);
//			}
//			
//		}
		
		//foreach loop
//		for(WebElement e:linksList) {
//			String text=e.getText();
//			String href=e.getAttribute("href");
//			
//			System.out.println(text+":"+href);
//			
//		}
		//Java Stream
		
		//linksList.stream().forEach(ele->System.out.println(ele.getText()));
		
//		linksList
//			.stream()
//				.filter(e->!e.getText().isEmpty())
//					.forEach(e-> System.out.println(e.getText()));
		
		//parallel stream
		
		linksList
		.parallelStream()
			.filter(e->!e.getText().isEmpty())
				.forEach(e-> System.out.println(e.getText()));
		
		
		
		
	}

}
