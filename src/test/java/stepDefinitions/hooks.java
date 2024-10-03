package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@NetBanking")
	public void netBankingSetUp() {
		System.out.println("****************************************");
		System.out.println("setup the entries in Netbanking database");
	}
	
	@After
	public void tearDown() {
		System.out.println("clear the entires");
	}
	
	@Before("@Mortgage")
	public void mortgageSetUp() {
		System.out.println("****************************************");
		System.out.println("setup the entries in Mortgage database");
	}
}


//Order of execution  :: @Before -> Background -> Scenario -> @After