package uni.fmi.task.model;

import uni.fmi.models.Participant;

import uni.fmi.task.service.TaskService;

public class TaskModel {
	private String title;
	private String content;
	private Participant assignedPerson;
	private String status;
	private String message;
	private String editTitle;
	private String currentStatus;
	private String newStatus;
	private String editMessage;

	public void setTaskTitle(final String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	public void setContent(final String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}

	public void setAssignedPerson(final Participant assignedPerson) {
		// TODO Auto-generated method stub
		this.assignedPerson = assignedPerson;
	}
	
	public void setStatus(final String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}
	
	public void createTaskButtonPressed() {
		// TODO Auto-generated method stub
		message = TaskService.create(title,content,status,assignedPerson);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	
	public void setEditTitle(final String title) {
		// TODO Auto-generated method stub
		this.editTitle = title;
	}

	public void setCurrentStatus(final String status) {
		// TODO Auto-generated method stub
		this.currentStatus = status;
	}
	
	public void setNewStatus(final String status) {
		// TODO Auto-generated method stub
		this.newStatus = status;
	}
	
	public void editTaskButtonPressed() {
		// TODO Auto-generated method stub
		editMessage = TaskService.edit(editTitle,currentStatus,newStatus);
	}

	public String getEditMessage() {
		// TODO Auto-generated method stub
		return editMessage;
	}
}
