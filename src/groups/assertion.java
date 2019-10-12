package groups;

import org.junit.rules.ErrorCollector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
/*	@Rule
	public ErrorCollector ec=new ErrorCollector ();
*/	

	@Test
	public void testtitle() {
		String actual= "google.com";
		String expected= "google inc";
	System.out.println("start comparision");
	try {
		Assert.assertEquals( actual, expected);		
	}
	catch(Throwable t) {
		System.out.println("error collector");
		
	}
	
		System.out.println("cod end here");
		
		/*if(actual_title==expected_title) {
		System.out.println("test case pass");
	}
	else
	{
		System.out.println("test case fail");
	}
	
	}
*/}


	private ErrorCollector errorcollector() {
		// TODO Auto-generated method stub
		return null;
	}


}
