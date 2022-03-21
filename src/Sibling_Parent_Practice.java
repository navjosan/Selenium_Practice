import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sibling_Parent_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.lambtoncollege.ca/etis/");
		driver.findElement(By.xpath("//div[@id='toplinks']/a[2]")).click();
		
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent_Id=it.next();
		String child_Id=it.next();
		driver.switchTo().window(child_Id);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
		element.sendKeys("C0790658@mylambton.ca");
		//Thread.sleep(3000);
		//driver.findElement(By.id("i0116")).sendKeys("C0790658@mylambton.ca");
		//driver.findElement(By.id("idSIButton9")).click();
		
		

	}

}
