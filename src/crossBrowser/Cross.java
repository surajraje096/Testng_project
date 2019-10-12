package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void run(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\JARs\\chromeSelinium\\chromedriver.exe");
			 driver = new ChromeDriver();
			 System.out.println("chrome");
		}else
		{
			if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","D:\\JARs\\chromeSelinium\\geckodriver.exe");
				 driver = new FirefoxDriver();
				 System.out.println("firefox");
			}else
			{
				System.setProperty("webdriver.ie.driver","D:\\JARs\\chromeSelinium\\Internet Explorer jar\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
				 System.out.println("ie");
			}
				
		}
		driver.get("https://www.bmw.com");
		driver.quit();
	}
	
	
	
	
	
	
	

}
