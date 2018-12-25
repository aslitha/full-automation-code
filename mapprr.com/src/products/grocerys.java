
package products;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class grocerys
{
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver gro=new ChromeDriver();
		gro.manage().window().maximize();
		gro.get("https://www.grofers.com");
		gro.findElement(By.xpath("//*[contains(text(),'Hyderabad')]")).click();
		Thread.sleep(5000);
		gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div/div[1]/div[1]/div/div/div/div/div[2]/div/a/div")).click();
		Thread.sleep(5000);
		// gro.findElement(By.xpath("//*[contains(text(),'No, Thanks')]")).click();
		
		WebElement beverages=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/li[1]/a"));
		Thread.sleep(5000);
		System.out.println(beverages.getText()+"="+beverages.getAttribute("href"));
		
		WebElement beveregesbest=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/li[2]/a"));
		Thread.sleep(5000);
		System.out.println(beveregesbest.getText()+"="+beveregesbest.getAttribute("href"));
		WebElement softdrinks=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/li[3]/a"));
		Thread.sleep(5000);
		System.out.println(softdrinks.getText()+"="+softdrinks.getAttribute("href"));
		WebElement cans=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/ul[1]/li[1]/a"));
		Thread.sleep(5000);
		System.out.println(cans.getText()+"="+cans.getAttribute("href"));
		WebElement pet=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/ul[1]/li[2]/a"));
		Thread.sleep(5000);
		System.out.println(pet.getText()+"="+pet.getAttribute("href"));
		WebElement mango=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/ul[1]/li[3]/a"));
		Thread.sleep(5000);
		System.out.println(mango.getText()+"="+mango.getAttribute("href"));
		WebElement juice=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/li[4]/a"));
		Thread.sleep(5000);
		System.out.println(juice.getText()+"="+juice.getAttribute("href"));
		WebElement juiceparts=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/ul/nav/ul[2]"));
		Thread.sleep(5000);
		List<WebElement>tag=juiceparts.findElements(By.tagName("a"));
		System.out.println(tag.size());
		
		
		
		 
		
	

	}

}
