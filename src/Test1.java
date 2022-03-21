import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		    driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		     

		    WebDriverWait w =new WebDriverWait(driver,5);

		   
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("getButtonBoxLink")));
		    driver.findElement(By.id("getButtonBoxLink")).click();

		   

		    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));

		   

		    System.out.println(driver.findElement(By.id("results")).getText());

		   

	}

}
