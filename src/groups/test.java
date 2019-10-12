package groups;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	@Test(priority=1)
	public void testlogin() {
		
		System.out.println("test login scren");
	}
	
	@Test(priority=2)
	public void testformfill() {
		System.out.println("testing registration form");
		throw new SkipException("this is skipd");
	}
	@BeforeMethod
	public void openbrowser() {
		System.out.println("opening browser");
	}
	@AfterMethod
	public void closebrowser() {
		System.out.println("closing browser");
	}
	@BeforeTest
	public void opendbconnection() {
		System.out.println("creat db conection");
	}
	@AfterTest
	public void closedbconnection() {
		System.out.println("closing db conection");
	}
	@BeforeSuite
	public void runseliniumserver() {
		System.out.println("starting selinium server");
	}
	@AfterSuite
	public void stopseliniumserver() {
		System.out.println("stop selinium server");
	}

}
