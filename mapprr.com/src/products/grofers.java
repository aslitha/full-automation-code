package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class grofers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver gro=new ChromeDriver();
		gro.manage().window().maximize();
		gro.get("https://www.grofers.com");
		gro.findElement(By.xpath("//*[contains(text(),'Hyderabad')]")).click();
		Thread.sleep(5000);
		gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div/div[1]/div[1]/div/div/div/div/div[2]/div/a/div")).click();
		Thread.sleep(5000);
		// gro.findElement(By.xpath("//*[contains(text(),'No, Thanks')]")).click();
		/*WebElement beve=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div/ul/nav/li[1]"));
		Thread.sleep(5000);
		System.out.println(beve.getText()+"="+beve.getAttribute("href"));
		WebElement beveoffer=gro.findElement(By.xpath("//*[contains(@class,'category-list__item no-child')]"));
		System.out.println(beveoffer.getText()+"="+beveoffer.getAttribute("href"));
		WebElement classes=gro.findElement(By.className("category-list__item"));
		List<WebElement>classl=classes.findElements(By.tagName("a"));
		System.out.println(classl.size());
		for(int i=0;i<classl.size();i++) 
		{
			System.out.println(classes.getText()+"="+classl.get(i).getAttribute("href"));
			
		}*/
		
		for(int f=1;f<=7;f++) {
			
			WebElement ul=gro.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div/ul/nav/li["+f+"]/a"));
			System.out.println(ul.getAttribute("href"));
			
			}
		}
		
	}

