package uni.fmi.task;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.models.Participant;
import uni.fmi.task.model.TaskModel;


public class TaskSteps {
	private TaskModel taskModel;

	@Given("^Участникът е отворил проект и натиска бутона за създаване на задача$")
	public void pressingCreateATaskButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel = new TaskModel();
	}

	@When("^Въведе заглавие \"([^\"]*)\"$")
	public void addTaskTitle(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.setTaskTitle(title);
	}

	@When("^Въведе съдържание \"([^\"]*)\" в полето съдържание$")
	public void addTaskContent(String content) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskModel.setContent(content);
	}

	@When("^Въведе статус \"([^\"]*)\" в полето за статус$")
	public void addStatus(String status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.setStatus(status);
	}

	@When("^Въведе назначен по задачата \"([^\"]*)\" в полето за назначен$")
	public void addAssignedParticipant(String person) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Participant assignedPerson = new Participant(person);
	    taskModel.setAssignedPerson(assignedPerson);
	}

	@When("^Натиска бутона за създаване$")
	public void clickCreateButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.createTaskButtonPressed();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void seeMessage(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(message,taskModel.getMessage());
	}
	
	//Редакция
	
	@Given("^Участникът е отворил задача и натиска бутона за редакция на задача$")
	public void openTaskEdit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskModel = new TaskModel();
	}
	
	@When("^Въведе заглавие на проект за редакция \"([^\"]*)\"$")
	public void enterEditTitle(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.setEditTitle(title);
	}

	@When("^Въведе статус \"([^\"]*)\" в полето статус$")
	public void enterCurrentStatus(String status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.setCurrentStatus(status);
	}

	@When("^Въведе нов статус \"([^\"]*)\" в полето за нов статус$")
	public void enterNewStatus(String newStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.setNewStatus(newStatus);
	}

	@When("^Натиска бутона за редакция$")
	public void clickEditButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    taskModel.editTaskButtonPressed();
	}
	
	@Then("^Вижда съобщение от редакция \"([^\"]*)\"$")
	public void seeEditMessage(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(message,taskModel.getEditMessage());
	}
	
}



