package contactModule;

import org.testng.annotations.Test;

public class CreateContactWithOrgTest {
	
	@Test(groups = "RT")
	public void createContactWithOrganization() {
		
		
		System.out.println("Created contact with org");
		
		
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String UNAME = System.getProperty("Username");
		String PWD = System.getProperty("Password");
		
		System.out.println(BROWSER);
	}

}
