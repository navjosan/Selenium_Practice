import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filtration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		//Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>price=list.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(list.size()==price.size())
		{
			System.out.println("Test is validated");
		}
		else
			System.out.println("Oops!, Test failed");
		
		System.out.println("Size of list is"+list.size());
		System.out.println("Size of price is"+price.size());
}

}
