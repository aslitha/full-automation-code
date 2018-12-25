package Mapprr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mapprr 
{
	public static void main(String[]args) throws InterruptedException
	{
		// Methods links=new Methods();
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.23.0-win64");
		// WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.get("https://mapprr.com/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//*[contains(@class,'mapprr_txt')]"));
		System.out.println("logo name is "+logo.getText());
		driver.findElement(By.id("login_btn")).click();
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//*[contains(text(),'Login ')]")).click();
	    WebElement otp=driver.findElement(By.id("otp"));
	    otp.sendKeys("123456");
	    otp.sendKeys(Keys.ENTER);
	    // links.Home1();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollto(0,1000)");
	    
	    driver.findElement(By.xpath("//*[contains(@class,'col-sm-12 footer_sub_title')]")).click();
	    
		
		
		
		
		
		
		
		
	}
	

}
