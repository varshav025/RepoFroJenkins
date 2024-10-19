package contactModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCreateContactTest {
	
	@Test
	public void createContact() {
		
		Reporter.log("Created contact",true);
		
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String UNAME = System.getProperty("Username");
		String PWD = System.getProperty("Password");
		
		System.out.println(BROWSER);
	}

}
