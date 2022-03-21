import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
//		
//		WebElement  drop_down =driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
//		Select country=new Select(drop_down);
//		country.selectByVisibleText("India");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Select currency=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByIndex(2);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			Thread.sleep(1000);
			
		}
		Thread.sleep(6000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='right1'] //a[@value='GOI']")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			//Assert.assertTrue(true);
			System.out.println("Return Date Calendar is enabled");
		}
		
//		else
//		{
//			Assert.assertTrue(false);
//		}
		
		driver.findElement(By.id("autosuggest")).sendKeys("Can");
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("Canada"))
			{
				option.click();
			}
		}
	}

}
