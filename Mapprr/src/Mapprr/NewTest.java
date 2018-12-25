package Mapprr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	  WebDriver driver=new ChromeDriver();
  @BeforeTest
  public void openmapprr() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mapprr.com ");  
  }
  @Test(priority=1)
  public void home()
  {
	  driver.findElement(By.linkText("Home")).click();
	   
  }
}
