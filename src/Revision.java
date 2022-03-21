import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revision {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//RadioButton Check for the two way check
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//Static Drop Down
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		select.selectByVisibleText("USD");
		
		//Updated Drop Down
		
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=1;i<=4;i++)
		{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#hrefIncChd")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Dynamic Drop Down
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='right1']//a[@value='ATQ']")).click();
		
		
		
		//Calendar Departure
		
		
		
		//List<WebElement> year_list=driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[2]"));
		
		
		while(true)
		{
			String text=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			System.out.println(text);
				if(text.equals("May 2022"))
				{
					break;
				}
				
				else
				{
					driver.findElement(By.cssSelector(".ui-icon-circle-triangle-e")).click();
				}
			
		}
		
		
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']"));
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase("23"))
			{
				list.get(i).click();
				break;
			}
		}
		
		//Calendar Return
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date2")).click();
		
		while(true)
		{
			String text=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			//System.out.println(text);
				if(text.equals("June 2022"))
				{
					break;
				}
				
				else
				{
					driver.findElement(By.cssSelector(".ui-icon-circle-triangle-e")).click();
				}
			
		}
		
List<WebElement> list_return=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']"));
		
		for(int i=0;i<list_return.size();i++)
		{
			if(list_return.get(i).getText().equalsIgnoreCase("24"))
			{
				list_return.get(i).click();
				break;
			}
		}
		
		
	}

}

