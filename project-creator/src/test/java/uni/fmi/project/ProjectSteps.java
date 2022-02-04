package uni.fmi.project;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.models.Participant;
import uni.fmi.project.model.ProjectModel;


public class ProjectSteps {
	private ProjectModel projectModel;
	private ProjectModel projectModelInside;
	@Given("^Потребителя отваря екрана за създаване на проект$")
	public void projectCreateScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModel = new ProjectModel();
	}

	@When("^Въведе име на проект \"([^\"]*)\"$")
	public void enterProjectName(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModel.setProjectName(name);
	}

	@When("^Въведе описание на проект \"([^\"]*)\" в полето описание$")
	public void enterProjectDescription(String desc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModel.setDescription(desc);
	}

	/*@When("^Въведе създател на проект \"([^\"]*)\" в полето създател$")
	public void enterProjectCreator(String creatorName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Participant creator = new Participant(creatorName);
	    projectModel.setProjectCreator(creator);
	}*/
	
	@When("^Въведе създател на проект \"([^\"]*)\" в полето създател `$")
	public void enterProjectCreator(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Participant creator = new Participant(name);
	    projectModel.setProjectCreator(creator);
	}

	@When("^Натиска бутона за създаване$")
	public void clickCreateButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModel.createProjectButtonPressed();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void message(String expMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //projectModel.getMessage();
		assertEquals(expMessage,projectModel.getMessage());
	}
	
	@Given("^Потребителя натиска бутона за нов проект,намиращ се в първоначалния проекта$")
	public void projectInsideCreateScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModelInside = new ProjectModel();
	}

	@When("^Въведе име на проект1 \"([^\"]*)\"$")
	public void enterProjectInsideName(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModelInside.setProjectName(name);
	}

	@When("^Въведе описание на проект1 \"([^\"]*)\" в полето описание$")
	public void enterProjectInsideDescription(String desc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModelInside.setDescription(desc);
	}

	@When("^Въведе създател на проект1 \"([^\"]*)\" в полето създател$")
	public void enterProjectInsideCreator(String creatorName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Participant creator = new Participant(creatorName);
	    projectModelInside.setProjectCreator(creator);
	}

	@When("^Натиска бутона за създаване1$")
	public void clickCreateInsideButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    projectModelInside.createProjectButtonPressed();
	}

	@Then("^Вижда съобщение1 \"([^\"]*)\"$")
	public void messageInside(String expMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(expMessage,projectModelInside.getMessage());
	    //projectModelInside.getMessage();
	}
}
