package Com.ipt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome_options {
	static WebDriver driver;
public static void Chrome () {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe" );
	ChromeOptions chrome = new ChromeOptions();
	chrome.addArguments("--start-maximized");
	chrome.addArguments("--incognito");
	driver = new ChromeDriver(chrome);
}
public static void wait1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.alertIsPresent());
	Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			.withTimeout (30,TimeUnit.SECONDS)
			.pollingEvery(10,TimeUnit.SECONDS)
			.ignoring(Exception.class);
 
}
	

public static void main(String[] args) {
	Chrome();
//	wait1();
}
}
