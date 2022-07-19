package OpenCartAndOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getElement(By locator) {
		
	return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public By getBy(String locatorType, String locatorValue) {
		By locator=null;
		
		switch (locatorType.toLowerCase()) {
		case "id":
			locator=By.id(locatorValue);
			break;
			
		case "name":
			locator=By.name(locatorValue);
			break;
		case "classname":
			locator=By.className(locatorValue);
			break;
		case "xpath":
			locator=By.xpath(locatorValue);
			break;
		case "cssselector":
			locator=By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator=By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator=By.partialLinkText(locatorValue);
			break;
		case "tegname":
			locator=By.tagName(locatorValue);
			break;
	

		default:
			System.out.println("plaese pass correct locator"+locatorValue);
			break;
		}
		return locator;
	}
	
	
	
	
	
}
