package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day6 {

	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data = new Object[3][2];
		
		//First set
		
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
	//Second set
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
	//Third set
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
	
	@Test(dataProvider ="getData")
	public void setData(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
}
