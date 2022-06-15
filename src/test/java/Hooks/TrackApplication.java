package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TrackApplication {

	@Before
	public void LaunchBrowser() {
		System.out.println("Semnox Application is Open --- Please Wait!!!");
		
	}
	
	
	@After
	public void CloseBrowser() throws Exception {
		System.out.println("Thankyou **** Welcome Again");
	}
	

}
