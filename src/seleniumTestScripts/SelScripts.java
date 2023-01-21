package seleniumTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		SelScripts sel = new SelScripts();
		sel.launchBrowser("chrome");
		sel.basciSeleniumFunction();
		sel.closeBrowser();
		
	}
	
	
	
	public void basciSeleniumFunction() {
		//get function is used to load the application in the browser
		driver.get("https://www.selenium.dev/downloads/");
		// get the page title
	  String title=	driver.getTitle();
	  System.out.println(title);
	  
	  //get the opened url 
	  String url =driver.getCurrentUrl();
	  System.out.println(url);
	  
	  //get current tab id
	  String id =  driver.getWindowHandle();
	  System.out.println(id);
	  //returns page html dom
	 String pagehtml = driver.getPageSource();
	 System.out.println(pagehtml);
		
	}
	
	public void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}


}
