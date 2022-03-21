import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("NavpreetKaur");
		driver.findElement(By.id("password")).sendKeys("navpreet123");
		driver.findElement(By.id("login-button")).click();

	}

}
