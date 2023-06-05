package Com.ipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
  public static void chrome() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\.eclipse\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("bharani");
	  
	  
	  
	  
}
  public static void main(String[] args) {
	chrome();
}
}
