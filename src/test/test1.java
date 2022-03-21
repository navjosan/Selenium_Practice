package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 
{
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void Demo(String url)
	{
		System.out.println("Hello");
		System.out.println("\n\n");
		System.out.println(url);
		System.out.println("\n\n");
	}
	
	@Test(enabled=false)
	public void Demo1()
	{
		System.out.println("World");
	}
}
