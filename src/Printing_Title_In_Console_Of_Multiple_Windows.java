import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Title_In_Console_Of_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
		
		int size_of_links=driver.findElements(By.tagName("a")).size();
		
		driver.findElement(By.xpath("//body/header/a[2]")).click();
		System.out.println(size_of_links);
		
		for(int i=0;i<size_of_links;i++)
		{
			String click_on_tabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(click_on_tabs);
			Thread.sleep(3000);
		}
	}

}
