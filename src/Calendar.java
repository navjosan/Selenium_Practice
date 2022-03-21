import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.cssSelector("input#travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")).getText().contains("October 2023"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='next']")).click();
		}

		List<WebElement> list_of_dates=driver.findElements(By.cssSelector("td.day"));
	
		for(int i=0;i<=driver.findElements(By.cssSelector("td.day")).size();i++)
		{
			if(driver.findElements(By.cssSelector("td.day")).get(i).getText().equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("td.day")).get(i).click();
				break;
			}
		}

	}

}
