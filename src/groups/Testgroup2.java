package groups;
import org.testng.annotations.Test;

public class Testgroup2 {
@Test(groups="low")
public void validflightresults() {
	System.out.println("validating flight result");
}
}
