package SeleniumSession;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtill brUtil=new BrowserUtill();
		brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.amazon.com");
		try {
			brUtil.navigateUrl(new URL("https://www.amazon.com"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actTitle=brUtil.getPageTitle();
		System.out.println("actual title is: "+actTitle);
		
		if(actTitle.contains("Amazon")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		System.out.println(brUtil.getPageSource().contains("Actionable Analytics"));
		System.out.println(brUtil.getPageUrl().contains("https://www.amazon.com"));
		
		brUtil.closeBrowser();
		
	}

}
