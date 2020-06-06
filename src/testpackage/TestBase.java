package testpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase{
	
		public WebDriver driver=null;
		
		public void Login() throws IOException
		{
			
			Properties prop=new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\HimanshuSharma\\eclipse-workspace\\testNGtu\\src\\testpackage\\datadriven.propeties");
			prop.load(fis);
			
			//System.setProperty("driver.chrome.driver","C:\\Personal_Data\\Java\\chromedriver_win32\\chromedriver.exe");
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("url"));
			
			if(prop.getProperty("browser").equals("chrome"))
			{
				System.setProperty(prop.getProperty("set01"),prop.getProperty("set02"));
				driver = new ChromeDriver();
			}
			else
			{
				 driver = new FirefoxDriver();
			}
			
			driver.get(prop.getProperty("url"));
		}
}
