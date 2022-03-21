import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green_Kart_Example {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		
	}
	
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{

	int j=0;

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++)

	{

	String[] name=products.get(i).getText().split("-");

	String formattedName=name[0].trim();

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

	j++;

	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	if(j==itemsNeeded.length)

	{

	break;

	}

	}
	}
	}
}


