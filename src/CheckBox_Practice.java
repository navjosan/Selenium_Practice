import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		boolean result = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.println(result);

		List<WebElement> total_count = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		for (WebElement count : total_count) {
			System.out.println(count.getText());
			System.out.println();
		}

	}

}
