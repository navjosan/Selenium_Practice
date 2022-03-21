import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th")).click();
		
		List<WebElement> original_list=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> str_list=original_list.stream().map(s->s.getText()).collect(Collectors.toList());

		List<String> sorted_list=str_list.stream().sorted().collect(Collectors.toList());
		List<String> price_values;
		do
		{
		List<WebElement>list=driver.findElements(By.xpath("//tr/td[1]"));
		//List<String> prices=list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		price_values=list.stream().map(s->getVeggiePrice(s)).collect(Collectors.toList());
		price_values.forEach(a->System.out.println(a));
		}while(price_values.size()>6);
	}

	public static String getVeggiePrice(WebElement s)
	{
	String price=s.findElement(By.xpath("//tr/td[2]")).getText();
	return price;
	}
}
