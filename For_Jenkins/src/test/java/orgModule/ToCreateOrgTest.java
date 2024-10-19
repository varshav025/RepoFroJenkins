package orgModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCreateOrgTest {

	@Test
	public void createOrg() {
		
		Reporter.log("Created organization",true);
		
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String UNAME = System.getProperty("Username");
		String PWD = System.getProperty("Password");
		
		System.out.println(BROWSER);
	}
}
