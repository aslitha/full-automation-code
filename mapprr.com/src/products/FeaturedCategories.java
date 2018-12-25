package products;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeaturedCategories {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mapprr.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'locate me')]")).click();
		Thread.sleep(50000);
		WebElement fivelinks=driver.findElement(By.xpath("//*[@id=\"owl-carousel\"]/div[1]/div"));
		Thread.sleep(5000);
		List<WebElement>hreflinks=fivelinks.findElements(By.tagName("a"));
		System.out.println(hreflinks.size());
		for(int i=0;i<hreflinks.size();i++) 
		{
			System.out.println(hreflinks.get(i).getAttribute("href"));
		}
		Thread.sleep(5000);
		driver.get("https://mapprr.com/products-by-category/Food-and-Groceries?query=84bNiiHFE20Nwrptvnn1yg==");
		WebElement arrivalfood=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]"));
		List<WebElement>foodandgroceries=arrivalfood.findElements(By.tagName("a"));
		WebElement titlename=driver.findElement(By.xpath("//*[@id=\"87101\"]/a[2]/div/div[2]"));
		for(int i=0;i<foodandgroceries.size();i++)
		{
			System.out.println(foodandgroceries.get(i));
			System.out.println(titlename.getAttribute("class=p_brand"));
		}
		System.out.println("*****************************");
		Thread.sleep(5000);
		driver.get("https://mapprr.com/products-by-category/Health-and-Beauty?query=ML8RNj9MWxtWWgYODzPadA==");
		WebElement arrivalbeauty=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]"));
		List<WebElement>healthandbeauty=arrivalbeauty.findElements(By.tagName("a"));
		for(int i=0;i<healthandbeauty.size();i++)
		{
			System.out.println(healthandbeauty.get(i).getText());
		}
		System.out.println("*****************************");
		Thread.sleep(5000);
		driver.get("https://mapprr.com/products-by-category/Electronics?query=y3GFz+xoXRSG3zLIVGML8g==");
		WebElement arrivalphones=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]"));
	    List<WebElement>Newphones=arrivalphones.findElements(By.tagName("a"));
		for(int i=0;i<Newphones.size();i++)
			{
				System.out.println(Newphones.get(i).getText());
			}
		System.out.println("*****************************");
		Thread.sleep(5000);
		driver.get("https://mapprr.com/products-by-category/Health-and-Pharmacy?query=68jmucEwXArJaB6xd6BHZw==");
		WebElement pharmacy=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]"));
		List<WebElement>HANDp=pharmacy.findElements(By.tagName("a"));
		for(int i=0;i<HANDp.size();i++)
			{
				System.out.println(HANDp.get(i).getText());
			}
		System.out.println("*****************************");
		Thread.sleep(5000);
		driver.get("https://mapprr.com/products-by-category/Books-and-Stationery?query=FEqZbgzNtPEHq82oD2lnUA==");
		WebElement books=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]"));
		List<WebElement>stationary=books.findElements(By.tagName("a"));
		for(int i=0;i<stationary.size();i++)
		{
			System.out.println(stationary.get(i).getText());
		}	
		}

}
