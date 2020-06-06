package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	@Parameters({"URL","APIKEY"})
	@Test(dependsOnMethods= {"B","C"})
	public void A(String urlname, int key)
	{
		System.out.println("A");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test
	public void B()
	{
		System.out.println("B");
	}
	
	@Test
	public void C()
	{
		System.out.println("C");
	}
	
	@Test(enabled=false)
	public void D()
	{
		System.out.println("D");
	}

}
