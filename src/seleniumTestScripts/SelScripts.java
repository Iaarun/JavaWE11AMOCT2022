package seleniumTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {

	WebDriver driver;

	public static void main(String[] args) {
		SelScripts sel = new SelScripts();
		sel.launchBrowser("chrome");
		sel.fileUpload();
		// sel.closeBrowser();

	}

	public void fileUpload() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement fileInput = driver.findElement(By.name("my-file"));
		fileInput.sendKeys("E:\\SharedDocuments\\TestPlanTestStrategy\\Test Plan.pdf");
	}

	public void handleCheckbox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
		// to check checkbox is selected
		System.out.println(checkbox2.isSelected());
		checkbox2.click();
		System.out.println(checkbox2.isSelected());
	}

	public void sendData() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement inputtext = driver.findElement(By.id("my-text-id"));
		// send data to input box
		inputtext.sendKeys("Testing Scripts....");

		// to check if element is enabled
		WebElement disabledInput = driver.findElement(By.name("my-disabled"));
		System.out.println(disabledInput.isEnabled());

		// handling hyperlink using linktext and partiallinktext
		// WebElement returnlink = driver.findElement(By.linkText("Return to index"));
		WebElement returnlink = driver.findElement(By.partialLinkText("Return to"));
		returnlink.click();
	}

	public void seleniumNavigationCommands() {
		// load web page onto the browser
		driver.navigate().to("https://www.selenium.dev/downloads/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("http://live.techpanda.org/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}

	public void basciSeleniumFunction() {
		// get function is used to load the application in the browser
		driver.get("https://www.selenium.dev/downloads/");
		// get the page title
		String title = driver.getTitle();
		System.out.println(title);

		// get the opened url
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// get current tab id
		String id = driver.getWindowHandle();
		System.out.println(id);
		// returns page html dom
		String pagehtml = driver.getPageSource();
		System.out.println(pagehtml);

	}

	public void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.quit();
	}

}
