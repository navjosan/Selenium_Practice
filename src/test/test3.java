package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class test3 {
	
	
	
	@Test(groups={"Smoke"})
	public void RestAPITesting()
	{
		System.out.println("Rest API Testing");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println();
		System.out.println("I will execute before the class test3");
		System.out.println();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println();
		System.out.println("I will execute after the class test3");
		System.out.println();
	}
	
	@Test(dependsOnMethods= {"WebTesting","UserLogin"})
	public void MobileTesting()
	{
		System.out.println("Mobile Testing");
	}

	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("I will execute before every method in test3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will execute after every method in test3");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will execute in the beginning of every testcase of all classes");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I will execute after every testcase of all the classes");
	}
	@Parameters({"URL","APIKey"})
	@Test
	public void WebTesting(String url,String ApiKey)
	{
		System.out.println("Web Testing");
		System.out.println("\n\n");
		System.out.println(url);
		System.out.println("\n\n");
		System.out.println(ApiKey);
	}
	
	@Test(dataProvider="getData")
	public void UserLogin(String username,String password)
	{
		System.out.println("User Login Testing");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object getData()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0]="first_username";
		obj[0][1]="first_password";
		obj[1][0]="second_username";
		obj[1][1]="second_password";
		obj[2][0]="third_username";
		obj[2][1]="third_password";
		
		return obj;
	}
}