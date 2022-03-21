import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class Soft_Assertions_With_Http_Connection {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert soft = new SoftAssert();
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		for(WebElement element:list)
		{
			String url=element.getAttribute("href");
			HttpURLConnection conn	=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			
			soft.assertTrue(respCode<400,element.getText());
		}
			
		soft.assertAll();
		
	}

}
