import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Different_Windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	
	String parent_Id = it.next();
	String child_Id = it.next();
	
	driver.switchTo().window(child_Id);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
	

	}

}

