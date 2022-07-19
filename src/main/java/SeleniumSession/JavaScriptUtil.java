package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	private WebDriver driver;

	public JavaScriptUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitleByJS() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js.executeScript("return document.title;").toString();
	}
	
	public void refreshBrowserByJS() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public void navigateToBackPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(-1)");
		
	}
	public void navigateToForwardPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(1)");
	}
	
	public void generateAlert(String message) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
		
	}
	public String getPageInnerText() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendKeysUsingWithId(String id, String value) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}
	
	public void scrollPageDown() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}	
	public void scrollPageDown(String height) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,'"+height+"')");
		
	}	
	public void scrollPageUp() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	public void scrollPageUp(String height) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo('"+height+"',0)");
		
	}
	
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
