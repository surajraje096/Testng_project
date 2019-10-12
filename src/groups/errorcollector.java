package groups;

import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class errorcollector{
	

	class ErrorCollector {
		
		private final Map<ITestResult, List<Throwable>> verificationFailuresMap = new HashMap<ITestResult, List<Throwable>>();


		public List<Throwable> getVerificationFailures() {
			List<Throwable> verificationFailures = verificationFailuresMap.get(Reporter.getCurrentTestResult());
			return verificationFailures == null ? new ArrayList<Throwable>() : verificationFailures;
		}
		
		public void addVerificationFailure(Throwable e) {
			List<Throwable> verificationFailures = getVerificationFailures();
			verificationFailuresMap.put(Reporter.getCurrentTestResult(), verificationFailures);
			verificationFailures.add(e);
		}
		
	}


}
