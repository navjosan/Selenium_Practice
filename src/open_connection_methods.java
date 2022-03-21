import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_connection_methods {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		String url;
			List<WebElement> list=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
			System.out.println(list.size());
			for(int i=0;i<list.size();i++)
			{
				url=list.get(i).getAttribute("href");
				HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int respCode=conn.getResponseCode();
				if(!(respCode<400))
				{
					System.out.println("Broken Link");
				}
				
				
			}
			
			
			
			
			
		
	}

}
