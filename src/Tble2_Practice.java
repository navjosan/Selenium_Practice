import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tble2_Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,700)");
		
		js.executeScript("document.querySelector('#product')");
		
		List<WebElement>values=driver.findElements(By.xpath("//table[@name='courses']//td[3]"));
		int sum=0;
		
		for(int i=0;i<values.size();i++)
		{
			//System.out.println(values.get(i).getText());
			
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		List<WebElement> counting_cols=driver.findElements(By.xpath("//table[@name='courses']//th"));
		System.out.println("Number of columns"+counting_cols.size());
		
		List<WebElement> counting_rows=driver.findElements(By.xpath("//table[@name='courses']//tr"));
		System.out.println("Number of rows"+counting_rows.size());
		
		for(int rows=0;rows<counting_rows.size();rows++)
		{
			for(int cols=0;cols<counting_cols.size();cols++)
			{
				if(rows==2 && cols==2)
				{
					System.out.println(counting_rows.get(rows).getText()+counting_cols.get(cols).getText());
				}
			}
		}
			
		
	}

}
