package Com.ipt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.io.TemporaryFilesystem;

public class Get_Navigate {
	static WebDriver driver;
	public static void getandnavigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.myntra.com");
		driver.get("https://www.amazon.com");
		driver.close();
		
	}
	public static void closeandquit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com");
		driver.get("https://www.nykaa.com");
		driver.findElement(By.xpath("//a[text()='hair']")).click();
//		driver.quit();
	
		
	}
public static void main(String[] args) {
      getandnavigate();
	closeandquit();
}
}
