package testpackage;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class day1 {
		
		@Test(groups={"smoke"})
		public void PersonalLoanweblogin()
		{
			System.out.println("PersonalLoanweblogin");
			System.out.println("PersonalLoanweblogin01");
			System.out.println("PersonalLoanweblogin02");
			System.out.println("PersonalLoanweblogin03");
			Assert.assertTrue(false);
			System.out.println("PersonalLoanweblogin04");
			System.out.println("PersonalLoanweblogin05");
			System.out.println("PersonalLoanweblogin06");
		}
		
		@Test
		public void PersonalLoanmobilelogin()
		{
			System.out.println("PersonalLoanmobilelogin");
		}
		@BeforeTest
		public void Prerequisites()
		{
			System.out.println("Before Test");
		}
		@AfterTest
		public void Postrequisites()
		{
			System.out.println("After Test");
		}
}
