package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSignUpPage {

	public static void main(String[] args) {
		
		BrowserUtill brUtil=new BrowserUtill();
		WebDriver driver=brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.orangehrm.com/orangehrm-30-day-trial");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		//By OR
		By fullName=By.id("Form_submitForm_Name");
		By email=By.id("Form_submitForm_Email");
		By phoneNumber=By.id("Form_submitForm_Contact");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(fullName, "mahima");
		eleUtil.doSendKeys(email, "mahima@gmail.com");
		eleUtil.doSendKeys(phoneNumber, "09876543");
		

		brUtil.quitBrowser();

		
	}

}
