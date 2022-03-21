import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Beginning {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.cssSelector("input#email")).sendKeys("navpreet@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("navpreet");
	//	driver.findElement(By.className("button")).click();
//		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.xpath("//div/input")).sendKeys("navjosan123@gmail.com");
		driver.findElement(By.cssSelector("input[type*='sub']")).click();
		
	}

}
