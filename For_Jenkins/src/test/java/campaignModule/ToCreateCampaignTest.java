package campaignModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCreateCampaignTest {
	
	
	@Test
	public void createCampaign() {
		
		Reporter.log("Created campaign",true);
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String UNAME = System.getProperty("Username");
		String PWD = System.getProperty("Password");
		
		System.out.println(BROWSER);
	}

}
