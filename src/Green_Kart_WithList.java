import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Green_Kart_WithList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String code = "rahulshettyacademy";
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<String> itemsInBag = new ArrayList<String>();
		itemsInBag.add("Cucumber");
		itemsInBag.add("Beetroot");
		itemsInBag.add("Carrot");

		//Explicit Wait
		WebDriverWait wait= new WebDriverWait(driver,5);
		
		Thread.sleep(2000);
		itemsAddedToBag(driver, itemsInBag);
		
	
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//Thread.sleep(2000);
		
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys(code);
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		
		driver.findElement(By.cssSelector("span.promoInfo")).getText();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Select country_dropDown = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		country_dropDown.selectByVisibleText("India");

		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	}

	public static void itemsAddedToBag(WebDriver driver, List<String> itemsInBag) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int count = 0;

		for (int i = 0; i < products.size(); i++) {
			String[] formattedString = products.get(i).getText().split("-");
			String finaleString = formattedString[0].trim();

			if (itemsInBag.contains(finaleString) && count <= itemsInBag.size()) {
				count++;
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
			}

			if (count == itemsInBag.size()) {
				break;
			}
		}
	}

}
