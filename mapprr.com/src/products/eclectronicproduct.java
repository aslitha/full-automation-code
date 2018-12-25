package products;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eclectronicproduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mapprr.com");
		driver.manage().window().maximize();
		// driver.findElement(By.id("login_btn")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.id("mobile")).sendKeys("1234567890");
		// driver.findElement(By.xpath("//*[contains(text(),'Login ')]")).click();
		//Thread.sleep(5000);
		// driver.findElement(By.id("otp")).sendKeys("123456");
		// driver.findElement(By.xpath("//*[contains(text(),'Submit ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'locate me')]")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id=\"owl-carousel\"]/div[1]/div/div[3]/div/a/img")).click();
	    WebElement arrivalphones=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]"));
		List<WebElement>Newphones=arrivalphones.findElements(By.tagName("a"));
		System.out.println(Newphones.size());
		for(int i=0;i<Newphones.size();i++) {
			System.out.println(Newphones.get(i).getText());
		}
		
		
		

	}

}
