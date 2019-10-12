package groups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testprierate {
	
	@Test(priority=1)
	public void testlogin() {
		System.out.println("exicution test one");
		Assert.fail();
		
	}
	@Test(priority=2,dependsOnMethods= {"testlogin"})
	public void testwo() {
		System.out.println("exicution test two");
		
	}
	@Test(priority=3,dependsOnMethods= {"testlogin"},alwaysRun=true)
	public void testthree() {
		System.out.println("exicution test three");
		
	}
	@Test(priority=4,dependsOnMethods= {"testlogin"},alwaysRun=true)
	public void testfour() {
		System.out.println("exicution test four");
		
	}

}
