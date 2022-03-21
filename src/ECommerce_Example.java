import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerce_Example {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] productsInBag= {"Cucumber","Beetroot","Carrot"};
		
		Thread.sleep(2000);
		
		Items_In_Cart(driver,productsInBag);
		

	}
	
	public static void Items_In_Cart(WebDriver driver,String[] productsInBag)
	{
		int count=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] formattedString=products.get(i).getText().split("-");
			String finalString=formattedString[0].trim();
			
			List itemsList=Arrays.asList(productsInBag);
			
			if(itemsList.contains(finalString) && count <= productsInBag.length)
			{
				count++; 
				
				  driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
				
			}
			
		}
	}
}
