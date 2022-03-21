import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
	//	System.out.println(driver.findElement(By.tagName("frameset")).getSize());
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();

	}

}
