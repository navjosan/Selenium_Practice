import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Combination_of_test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#google_vignette");
		
		
		String s=driver.findElement(By.xpath("//fieldset//label[@for='benz']")).getText();
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(s);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("dropdown-class-example"))).click().sendKeys(s).build().perform();
		
		driver.findElement(By.cssSelector("input#name")).sendKeys(s);
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//input[@id='alertbtn']"))).click().sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		String message=driver.switchTo().alert().getText();
		
		System.out.println(message);
		
		if(message.contains(s))
		{
			System.out.println("Mission Successful");
			driver.switchTo().alert().accept();
		}

		else
		{
			System.out.println("Try Again Later");
		}
	}

}
