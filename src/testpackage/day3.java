package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void HomeLoanweblogin()
	{
		System.out.println("HomeLoanweblogin");
	}
	
	@Test(groups={"smoke"})
	public void HomeLoanmobilelogin()
	{
		System.out.println("HomeLoanmobilelogin");
	}
	@BeforeSuite
	public void Preparation()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void PostExecution()
	{
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void Beforeevery()
	{
		System.out.println("Before every method");
	}
	@AfterMethod
	public void Afterevery()
	{
		System.out.println("After every method");
	}
	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("Before Class Methodsa");
	}
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("after Class Methods");
	}
}
