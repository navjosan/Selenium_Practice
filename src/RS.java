import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RS {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.findElement(By.id("checkBoxOption2")).click();

        String opt=driver.findElement(By.xpath("//fieldset//label[@for='benz']")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt))

     {

    System.out.println("Alert message success");

     }

     else

    System.out.println("Something wrong with execution");



	}

}
