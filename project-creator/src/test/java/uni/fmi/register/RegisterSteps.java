package uni.fmi.register;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;
import uni.fmi.register.model.RegisterScreenModel;

public class RegisterSteps {
	private RegisterScreenModel registerModel;

	@Given("^Участникът отваря екрана за регистрация$")
	public void openRegisterScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    registerModel = new RegisterScreenModel();
	}

	@When("^Въведе потребителско име \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
		registerModel.setUsername(username);
	}

	@When("^Въведе парола \"([^\"]*)\" в полето парола$")
	public void addFirstPassword(final String password) throws Throwable {
		registerModel.setFirstPassword(password);
	}

	@When("^Въведе парола \"([^\"]*)\" в полето за втора парола$")
	public void addSecondPassword(final String password) throws Throwable {
		registerModel.setSecondPassword(password);
	}
	
	@When("^Въведе роля \"([^\"]*)\" в полето за роля$")
	public void addRole(final String role) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		registerModel.setRole(role);
	}


	@When("^Натиска бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
		registerModel.clickRegisterButton();
	}
	
	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void seeMessage(String expMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(expMessage, registerModel.getMessage());
	}
}
