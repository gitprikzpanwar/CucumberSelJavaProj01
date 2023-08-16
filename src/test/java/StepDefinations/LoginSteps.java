package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	
		System.out.println("Hi");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Hi");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Hi");
	}

	@Tha("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Hi");
	}

	@When("user enters user1 and pass1")
	public void user_enters_user1_and_pass1() {
		System.out.println("Hi");
	}

	@When("user enters user2 and pass2")
	public void user_enters_user2_and_pass2() {
		System.out.println("Hi");
	}

}
