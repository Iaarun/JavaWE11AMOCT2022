package seleniumTestScripts;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SelScripts {

	WebDriver driver;

	public static void main(String[] args) throws Exception {
		SelScripts sel = new SelScripts();
		sel.launchBrowser("chrome");
		sel.getBrokenlinks();

		// sel.closeBrowser();

	}
	public void getBrokenlinks() throws MalformedURLException, IOException {
		driver.get("https://www.amazon.in/");
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		// li.forEach(x->{System.out.println(x.getText()+"||"+x.getAttribute("href"));});
//		long starttime = System.currentTimeMillis();
//		for (WebElement ele : li) {
//			String url = ele.getAttribute("href");
//			if (url != null && !url.contains("javascript")) {
//				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//				connection.connect();
//
//				int code = connection.getResponseCode();
//				if (code != 200) {
//					System.out.println("Not Working :: " + url);
//				}
//
//				connection.disconnect();
//			}
//
//		}

//		long endtime = System.currentTimeMillis();

	 long starttime=	System.currentTimeMillis();

	 li.parallelStream().forEach(
			 x->{
				 String url = x.getAttribute("href"); 
				 if(url !=null && !url.contains("javascript")) {
					 try {
						HttpURLConnection connection = 
							(HttpURLConnection)	new URL(url).openConnection();
						connection.connect();
						
						int code= connection.getResponseCode();
						if(code==200) {
							System.out.println("Working :: "+url);
						}
						
						connection.disconnect();
					}catch(Exception e) {
						e.printStackTrace();
					}
			 }
			 }
			 );
	 long endtime = System.currentTimeMillis();
	 System.out.println(starttime-endtime);
	}

	public void brokenlink() throws Exception {
		driver.get("https://www.amazon.in/");
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());

		long starttime = System.currentTimeMillis();
		li.forEach(x -> {
			String url = x.getAttribute("href");
			if (url != null && url.contains("javascript")) {

				
//					HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//					connection.connect();
//					int code = connection.getResponseCode();
//
//					if (code != 200) {
//						System.out.println("Not Working :" + url);
//					}
//					connection.disconnect();
				

			}
		});
		
		System.out.println("total time:"+(starttime-System.currentTimeMillis()));
	}

	public void handleCalender() {
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		String caltitle = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(caltitle);
		String month = caltitle.split(" ")[0].trim();
		String year = caltitle.split(" ")[1].trim();

		String nyear = String.valueOf(Integer.parseInt(year) + 1);

		while (!(month.equals("March") && (year.equals(nyear)))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			caltitle = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(caltitle);
			month = caltitle.split(" ")[0].trim();
			year = caltitle.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//a[normalize-space()='30']")).click();

	}

	public void multipleWindowsusingsel3() {
		driver.get("https://www.naukri.com/");
		String hpageid = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		WebElement services = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
		services.click();
		Set<String> allid = driver.getWindowHandles();

		for (String id : allid) {
			if (!id.equals(hpageid)) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(hpageid);
		System.out.println(driver.getCurrentUrl());
	}

	public void multipleWindows() {
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://resume.naukri.com/");
		System.out.println(driver.getCurrentUrl());
	}

	public void tooltip() {
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));
		System.out.println(age.getAttribute("title"));
	}

	public void handleContextclick() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
		driver.findElement(By.id("my-dropdown-1")).click();

		WebElement clickele = driver.findElement(By.id("my-dropdown-2"));
		Actions action = new Actions(driver);

		action.contextClick(clickele).perform();

		WebElement doubleclickele = driver.findElement(By.id("my-dropdown-3"));

		// action.doubleClick(doubleclickele).perform();
		action.doubleClick(doubleclickele).perform();

		WebElement cc3 = driver.findElement(By.id("context-menu-3"));
		action.moveToElement(cc3).keyDown(Keys.ARROW_DOWN).click().build().perform();
	}

	public void handlislider() {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		Actions action = new Actions(driver);

		action.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();
	}

	public void handleScreenshot() throws IOException {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).perform();

		// capture screenshot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\dd.jpeg"));

		file = drop.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\drop.png"));
	}

	public void handleDragdrop() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).perform();

		// action.clickAndHold(drop).moveByOffset(200, 0).release().build().perform();
	}

	public void handleframe() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println(drag.isDisplayed());

		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//a[@href='/']")).isDisplayed());
	}

	public void dropdown() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement dd = driver.findElement(By.name("my-select"));
		Select select = new Select(dd);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Three");
		Thread.sleep(500);
		select.selectByValue("1");
		Thread.sleep(500);
		select.selectByIndex(2);

		// get all option from the dropdown
		List<WebElement> alloption = select.getOptions();

		alloption.forEach(x -> {
			System.out.println(x.getText());
		});

		System.out.println(select.isMultiple());

		/*
		 * selectbyindex selectbyvalue selectbyvisibletext ismultiple getoptions
		 * getfirstselectedoption deselectall deselectbyindex deselectbyvalue
		 * deselectbyvisible getallselectionoption
		 */

	}

	public void handleAlert() {
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Say my name!']"));
		btn.click();
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.sendKeys("TestUser");
		alert.accept();
		System.out.println(alert.getText());
		alert.dismiss();

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
