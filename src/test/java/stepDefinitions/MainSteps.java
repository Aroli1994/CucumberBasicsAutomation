package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on NetBanking landing page");
	}

	@When("User login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application with username = " + username + " and password = " + password);
	}

	@When("^User login into application with uname (.+) and pwd (.+)$")
	public void user_login_into_application_with_uname_and_pwd(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application with username = " + username + " and password = " + password);
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}

	@Given("User is on Practice Page")
	public void user_is_on_practice_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Practice Page");
	}

	@When("User SignUp into application")
	// public void user_sign_up_into_application(io.cucumber.datatable.DataTable
	// dataTable) {
	public void user_sign_up_into_application(List<String> data) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
	}
	
	@Given("setup the entries in database")
	public void setUpEntries() {
		System.out.println("*****************************");
		System.out.println("setup the entries in database");
	}
	
	@When("launch the browser from config variables")
	public void launchBrowser() {
		System.out.println("launch the browser from config variables");
	}
	
	@When("hit the home page url of banking site")
	public void hitUrl() {
		System.out.println("hit the home page url of banking site");
	}

}
