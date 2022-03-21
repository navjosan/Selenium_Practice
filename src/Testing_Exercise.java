import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing_Exercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.linkText("Nested Frames")).click();
//
//		driver.switchTo().frame("frame-top");
//
//		driver.switchTo().frame("frame-middle");
//
//		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.linkText("iFrame")).click();
		//driver.findElement(By.cssSelector("button.tox-mbtn.tox-mbtn--select")).click();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("span.tox-mbtn__select-label"))).click().build().perform();
	}

}
