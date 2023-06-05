package Com.ipt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static WebDriver driver;
	public static void select () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select sell = new Select(fruit);
		sell.selectByValue("3");
		
		
		
	}
	public static void  frame () {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("LEO");
	}
	public static void main(String[] args) {
		select();
		frame();
	}
		
	}
	

