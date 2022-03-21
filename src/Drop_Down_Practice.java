import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drop_Down_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Static Drop Down
		
		WebElement drop_down_currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency=new Select(drop_down_currency);
		currency.selectByVisibleText("USD");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		System.out.println(currency.getFirstSelectedOption().getText());
		
		// Updated Drop Down Practice
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			Thread.sleep(1000);
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
	
		//Thread.sleep(2000);

	//Dynamic Drop Down
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='right1'] //a[@value='DEL']")).click();
		
		//Code for the Drop Down when options are not available by default
		
		//AutoSuggestive Drop Down
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options=driver.findElements(By.cssSelector("ul[id='ui-id-1'] a"));
		
		
		for(WebElement option:options)
		{
			
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}
}
