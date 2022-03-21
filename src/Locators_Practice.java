import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.lambtoncollege.ca/custom/Pages/Tour_the_Campus.aspx");
	
		driver.findElement(By.id("first_name")).sendKeys("Navpreet");
		driver.findElement(By.cssSelector("input[name*='last_name']")).sendKeys("Kaur");
		driver.findElement(By.xpath("//textarea[contains(@id,'street')]")).sendKeys("18, Pika Trail Braydon, Ontario");
		driver.findElement(By.cssSelector("input[id*='city']")).sendKeys("Brampton");
		driver.findElement(By.id("zip")).sendKeys("L6R 2Y1");
		driver.findElement(By.id("email")).sendKeys("navjoshan92@gmail.com");
		Select Phone=new Select(driver.findElement(By.id("phoneType")));
		Phone.selectByVisibleText("Cell/Mobile");
		Phone.selectByIndex(1);
		driver.findElement(By.id("phone")).sendKeys("647-646-7040");
		
//		Select Month=new Select(driver.findElement(By.id("ddlBirthMonth")));
//		Month.selectByVisibleText("Oct");
//		Month.selectByIndex(10);
		
		WebElement month_dropDown=driver.findElement(By.id("ddlBirthMonth"));
		Select month = new Select(month_dropDown);
	    month.selectByVisibleText("Oct");
		
		//	Select Day=new Select(driver.findElement(By.id("ddlBirthDay")));
			//Day.selectByVisibleText("14");
		//	Day.selectByIndex(14);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    
	    Thread.sleep(3000);
	    WebElement day_dropDown=driver.findElement(By.id("ddlBirthDay"));
		Select day = new Select(day_dropDown);
	    day.selectByVisibleText("14");
		
	    driver.findElement(By.cssSelector("input[id*='DOB']")).sendKeys("1997");

	    Select Month=new Select(driver.findElement(By.id("ddlMonth")));
		Month.selectByVisibleText("Feb");
		
		Thread.sleep(3000);
		Select Day=new Select(driver.findElement(By.id("ddlDay")));
		Day.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[id*='Tour_0']")).click();
		
		Thread.sleep(2000);
		
		Select i_Am_a=new Select(driver.findElement(By.id("ddlType")));
		i_Am_a.selectByIndex(4);
		
		Thread.sleep(2000);
		Select Program=new Select(driver.findElement(By.id("ddlProgram")));
		Program.selectByIndex(4);
		
		Thread.sleep(2000);
		Select Status=new Select(driver.findElement(By.id("ddlStatus")));
		Status.selectByIndex(3);
		
		driver.findElement(By.linkText("myLambton")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Thread.sleep(1000);
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent_Id = it.next();
		String child_Id = it.next();
		
		driver.switchTo().window(child_Id);	
		Thread.sleep(2000);
		driver.findElement(By.id("i0116")).sendKeys("c0790658@mylambton.ca");
		
	}

}
