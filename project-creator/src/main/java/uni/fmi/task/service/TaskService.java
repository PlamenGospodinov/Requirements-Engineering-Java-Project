package uni.fmi.task.service;

import java.util.ArrayList;

import java.util.List;

import uni.fmi.models.Participant;
import uni.fmi.models.Task;

public class TaskService {
	static Participant assignedPersonOne = new Participant("Petio","Ivanov","regular");
	private static List<Task> tasksDb = new ArrayList<>();
	public static String create(final String title, final String content,final String status,final Participant assignedPerson) {
		
		if (title.trim().equals("") && content.trim().equals("") &&  status.trim().equals("")) {
			return "Въведете данни за задачата!";
		}
		
		if (null == title || title.trim().equals("")) {
			return "Въведете заглавие на задачата!";
		}
		
		if (null == status || status.trim().equals("")) {
			return "Въведете статус на задачата!";
		}
		
		if(assignedPerson.getUsername() == "") {
			return "Въведете участник отговорен за задачата!";
		}
		
		if (null == content || content.trim().equals("")) {
			return "Въведете описание на задачата!";
		}


		if (content.trim().length() <= 7) {
			return "Съдържанието трябва да е по-дълго от 7символа!";
		}

		
		boolean isTaskExists = tasksDb.stream().anyMatch(u -> u.getTitle().equals(title));
		
		if(isTaskExists == false) {
			Task newTask = new Task(title,content,status,assignedPerson);
			tasksDb.add(newTask);
			
		}	
		
		return isTaskExists ? "Заглавие на задачата е заето!" : "Създадохте задача успешно!";
	}
	
	
	
	
public static String edit(final String title, final String currentStatus,final String newStatus) {
		
		if (title.trim().equals("") && currentStatus.trim().equals("") &&  newStatus.trim().equals("")) {
			return "Въведете данни за задачата!";
		}
		
		if (null == title || title.trim().equals("")) {
			return "Въведете заглавие на задачата!";
		}
		
		if (null == currentStatus || currentStatus.trim().equals("")) {
			return "Въведете статус на задачата!";
		}
		
		if(null == newStatus || newStatus.trim().equals("")) {
			return "Въведете нов статус на задачата!";
		}
		
		if (currentStatus.trim().equals("finished")) {
			return "Не може да смените статуса на завършена задача!";
		}

		boolean isTaskExists = tasksDb.stream().anyMatch(u -> u.getTitle().equals(title));
		
		if(isTaskExists == false) {
			return "Задача с такова име няма!";
			
		}	
		
		return "Редактирахте задача успешно!";
	}
}
