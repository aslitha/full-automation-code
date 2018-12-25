package Mapprr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods
{
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// WebDriver driver=new ChromeDriver();
	public  void Home1() 
	{
		driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
		
	}
	
}
