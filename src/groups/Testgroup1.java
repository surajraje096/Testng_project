package groups;
import org.testng.annotations.Test;

public class Testgroup1 {
	
	
	
	
	
	@Test(priority=1,groups= {"high"})
	public void dologin() {
		System.out.println("login the system");
	}
	@Test(priority=2,groups= {"low"})
	public void fillform() {
		System.out.println("filling the form");
	}
	@Test(priority=3,groups= {"mid"})
	public void searchfligt() {
		System.out.println("searching the flight");
	}
	@Test(priority=4,groups= {"high"})
	public void bookticket() {
	System.out.println("booking a ticket ");	
	}

}
