import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameInEditBox=driver.findElement(By.xpath("//input[@name='name']"));
		
	System.out.println(driver.findElement(with(By.tagName("label")).above(nameInEditBox)).getText());

		//System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
	}

	

}
