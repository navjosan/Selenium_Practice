import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling_with_javascript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		int sum=0;
		String single_value;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		
		for(int i=0;i<values.size();i++)
		{
			single_value=values.get(i).getText();
			sum=sum+Integer.parseInt(single_value);
		}
		
		String expected_string=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int expected_value=Integer.parseInt(expected_string);
		Assert.assertEquals(sum, expected_value);
		//System.out.println(expected_value);
	}

}
