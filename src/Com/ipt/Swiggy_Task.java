package Com.ipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy_Task {

	static WebDriver driver ;
	public static void swiggy() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		

	driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vadapalani");
	driver.findElement(By.xpath("//span[text()='FIND FOOD']")) .click();
	
	

	}
}
