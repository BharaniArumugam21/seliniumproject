package Com.ipt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynami_xpath {
	static WebDriver driver ;
	public static void myntra() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/men-tshirts");
    List<WebElement> totalnumber = driver.findElements(By.xpath("//span[text()='1099']"));
	int size = totalnumber.size();
	System.out.println("Total number of products with RS1099 is " +size);
	}
	
	public static void flipkart() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.xpath("//div[text()='Mobiles']//following::div[text()='Appliances']")).click();
		
	}
public static void main(String[] args) {
//	myntra();
	flipkart();

}	
}

