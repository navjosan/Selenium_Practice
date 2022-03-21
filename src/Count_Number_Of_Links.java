import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Number_Of_Links {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1- Count the total number of links in the page
		
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//2- Count the links in the footer
		
	WebElement footerCount=driver.findElement(By.cssSelector("div#gf-BIG"));
	//System.out.println(footerCount.findElements(By.tagName("a")).size());
	int count2=footerCount.findElements(By.tagName("a")).size();
	System.out.println(count2);
	
	//3- Count the links of the column in the footer
	
	WebElement columnCount=footerCount.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(columnCount.findElements(By.tagName("a")).size());
	
		//4- Click on each link of the column
		
		
		for(int i=1;i<columnCount.findElements(By.tagName("a")).size();i++)
		{
			
			String control_Of_Keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnCount.findElements(By.tagName("a")).get(i).sendKeys(control_Of_Keys);
			
			Thread.sleep(5000);
		}
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
