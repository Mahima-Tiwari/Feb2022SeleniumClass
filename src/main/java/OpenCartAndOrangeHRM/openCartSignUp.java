package OpenCartAndOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openCartSignUp {

	public static void main(String[] args) {
			
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		
		ElementUtil eleUtil=new ElementUtil(driver);
		//By OR
		By firstName=eleUtil.getBy("id", "input-firstname");
		By lastName=eleUtil.getBy("cssselector","#input-lastname");
		By email=eleUtil.getBy("name", "email");
		By telePhone=eleUtil.getBy("xpath", "//*[@id=\"input-telephone\"]");
		By password=eleUtil.getBy("id", "input-password");
		By confirmPassword=eleUtil.getBy("id", "input-confirm");
		By chkeckBoxPrivacyPolicy=eleUtil.getBy("name", "agree");
		By continueBtn=eleUtil.getBy("cssselector", "#content > form > div > div > input.btn.btn-primary");
		By errEmailMsg=eleUtil.getBy("classname", "text-danger");
		
		eleUtil.doSendKeys(firstName, "mahima");
		eleUtil.doSendKeys(lastName, "tiwari");
		eleUtil.doSendKeys(email, "mahimaanimation@gmail.com");
		eleUtil.doSendKeys(telePhone, "6656656565");
		eleUtil.doSendKeys(password, "Test@123");
		eleUtil.doSendKeys(confirmPassword, "Test@123");
		eleUtil.doClick(chkeckBoxPrivacyPolicy);
		eleUtil.doClick(continueBtn);
		
		String actualErrMsg=eleUtil.doGetElementText(errEmailMsg);
		System.out.println(actualErrMsg);
		
		if(actualErrMsg.equals("E-Mail Address does not appear to be valid!") ){
			System.out.println("correct error msg");
		}
		else {
			System.out.println("in-correct error");
		}
		
		
		

		
	}

}
