import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pagination {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		List<String> original_List=elementList.stream().map(s->s.getText()).collect(Collectors.toList());

		List<String> sorted_List=original_List.stream().sorted().collect(Collectors.toList());
		
	//	Assert.assertTrue(original_List.equals(sorted_List));
		List<String> price;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		 price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->(getVeggiePrice(s))).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}

	private static String getVeggiePrice(WebElement s)
	{
		
		String price_value=s.findElement(By.xpath("//tr/td[2]")).getText();
		
		return price_value;
		
	}
}
