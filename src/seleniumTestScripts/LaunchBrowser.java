package seleniumTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		LaunchBrowser lb = new LaunchBrowser();
		lb.launnchBrowser("firefox");
	}
	
	public void launnchBrowser(String browser) {
		WebDriver driver;
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	//launch browser with selenium version  4.6.0 and above
	public void launchChrome() {
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

	
	public void launchFirefox() {
		WebDriver driver = new FirefoxDriver();
		driver.quit();
	}
}
