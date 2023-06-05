package Com.ipt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Swiggy {
	static WebDriver driver;
	public static void task() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("vadapalani");
		driver.findElement(By.xpath("//span[text()='Vadapalani, Chennai, Tamil Nadu, India']")).click();
		driver.findElement(By.xpath("//span[text()='Search']")) .click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("briyani");
		driver.findElement(By.xpath("//div[text()='Chicken Biryani']")) .click();
		driver.findElement(By.xpath("(//div[text()='ADD'])[2]")) .click();
		driver.findElement(By.xpath("//span[text()='Add Item']")) .click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}	
		
	
	public static void facebook (){
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")) .sendKeys("9524832252");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bharani@21");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
 
	}
public static void main(String[] args) {
	facebook();
}
		
	}


