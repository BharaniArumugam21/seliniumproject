package Com.ipt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robots_Task {
	static WebDriver driver;
	public static void Chrome() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
    driver = 	new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    Robot r = new Robot();
    //new tab
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_T);
    
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_T);
    //new incognoto windown
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_N);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_N);
    //downloads
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_J);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_J);
    }

   public static void swiggy() throws AWTException {
	   System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
	   driver = new ChromeDriver ();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   driver.get("https://www.swiggy.com/");
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vadapalani");
	   driver.findElement(By.xpath("//span[text()='Vadapalani, Chennai, Tamil Nadu, India']")).click();
	   driver.findElement(By.xpath("//span[text()='Search']")).click();
	   Robot rr = new Robot();
	 rr.keyPress(KeyEvent.VK_CAPS_LOCK);
	 rr.keyPress(KeyEvent.VK_B); 
	 rr.keyPress(KeyEvent.VK_U);
	 rr.keyPress(KeyEvent.VK_R);
	 rr.keyPress(KeyEvent.VK_G);
	 rr.keyPress(KeyEvent.VK_E);
	 rr.keyPress(KeyEvent.VK_R); 
	 rr.keyPress(KeyEvent.VK_S);
	 rr.keyPress(KeyEvent.VK_CAPS_LOCK);
	 rr.keyRelease(KeyEvent.VK_B); 
	 rr.keyRelease(KeyEvent.VK_U);
	 rr.keyRelease(KeyEvent.VK_R);
	 rr.keyRelease(KeyEvent.VK_G);
	 rr.keyRelease(KeyEvent.VK_E);
	 rr.keyRelease(KeyEvent.VK_R); 
	 rr.keyRelease(KeyEvent.VK_S);
	 
   }
//   public static void swiggy1() throws AWTException {
//	   System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
//	   driver = new ChromeDriver ();
//	   driver.manage().window().maximize();
//	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	   driver.get(null);
public static void main(String[] args) throws AWTException {
//	Chrome();
	swiggy();
	
	
}
}