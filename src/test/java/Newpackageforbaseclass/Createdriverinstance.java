package Newpackageforbaseclass;

import java.sql.Driver;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.Return;

public class Createdriverinstance {
	
	public WebDriver createbrowser()
	{
		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver","E:/81/chromedriver_win32 (1)/chromedriver.exe");
		return driver = new ChromeDriver();
		
		/*ResourceBundle config = ResourceBundle.getBundle("config");// accessing the file
		WebDriver driver;
		if (config.getString("browser").equalsIgnoreCase("chrome"))// reading data from file
				{
			System.setProperty("WebDriver.chrome.driver","./driver.chromedriver.exe");
			
			driver= new ChromeDriver();
				}
		else if(config.getString("browser").equalsIgnoreCase("firefox"))
		{
		System.setProperty("WebDriver.chrome.driver","./driver.gechkodriver.exe");	
			driver= new FirefoxDriver();}
		else 
		{
	System.setProperty("WebDriver.chrome.driver","./driver.chromedriver.exe");
	driver= new ChromeDriver();
		}
		driver.get(config.getString("AppURL"));
		return driver;
		*/
	}
	
	public void closebrowser(WebDriver driver)
	{
		driver.quit();
		
	}
}

