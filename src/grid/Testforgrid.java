package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testforgrid {

	public static Properties prop;

	@Test
	public void test1() throws MalformedURLException {
		
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
			ChromeOptions opetion=new ChromeOptions();
			opetion.merge(cap);
			URL url = new URL("http://localhost:4444/wd/hub");
			WebDriver driver= new RemoteWebDriver(url,opetion);
			driver.get("http://facebook.com");
			System.out.println("title is"+driver.getTitle());
			driver.quit();
	}
		
		}
	