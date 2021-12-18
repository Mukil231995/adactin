package stepDefenation;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
    @Before
	public void before() {

		initializeBrowser();
	}
	@After
	public void after() {
		//driver.quit();
		System.out.println("finish");

	}
}
