import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Activities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.lambtoncollege.ca/etis/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

		
	}

}
