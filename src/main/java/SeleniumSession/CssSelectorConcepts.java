package SeleniumSession;

import org.openqa.selenium.By;

public class CssSelectorConcepts {

	public static void main(String[] args) {
		//CssSelector is not an attribute
		//for id--> #id
		//for class--> .className
		
		//		#input-email
		//		input#input-email
		
		By.cssSelector("#input-email");
		By.cssSelector("input#input-email");//tagname#id
		By.cssSelector(".form-control");//.className
		By.cssSelector("input.action");// tagName.className
		By.cssSelector("");// tagName.className#id
		By.cssSelector("");// tagName#id.className
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		By.cssSelector("");
		
		
		

	}

}
