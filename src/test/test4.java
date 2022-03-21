package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test4 
{
	@Test(groups= {"Smoke"})
	public void MobinLogin()
	{
		System.out.println("Mobile Login");
	}
	
	@Test(timeOut=4000)
	public void MobileSignOut()
	{
		System.out.println("Mobile Sign Out");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileWorking(String url)
	{
		System.out.println("Mobile Working");
		System.out.println("\n\n");
		System.out.println(url);
		System.out.println("\n\n");
	}
	
	@Test
	public void WebLogin()
	{
		System.out.println("Web Login");
	}
}
