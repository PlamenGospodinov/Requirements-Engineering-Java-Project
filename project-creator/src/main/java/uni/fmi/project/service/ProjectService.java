package uni.fmi.project.service;

import java.util.ArrayList;

import java.util.List;

import uni.fmi.models.Participant;
import uni.fmi.models.Project;

public class ProjectService {
	static Participant participantOne = new Participant("Ivan","Ivanov","leader");
	//new Project("Calculator","This is a calculator project",participantOne)
	private static List<Project> projectsDb = new ArrayList<>();
	public static String create(final String name, final String description,final Participant participant) {
		
		if (participant.getUsername() == "" && description.trim().equals("") && name.trim().equals("")) {
			return "Въведете данни за проекта!";
		}
		
		if (null == name || name.trim().equals("")) {
			return "Въведете име на проекта!";
		}
		
		if (null == description || description.trim().equals("")) {
			return "Въведете описание на проекта!";
		}


		if (description.trim().length() <= 10) {
			return "Описанието трябва да е по-дълго от 10символа!";
		}

		
		
		if(participant.getUsername() == "") {
			return "Въведете създател на проекта!";
		}
		boolean isProjectExists = projectsDb.stream()
				.anyMatch(u -> u.getProjectName().equals(name));
		if(isProjectExists == false) {
			Project newProject = new Project(name,description,participant);
			projectsDb.add(newProject);
		}
		return isProjectExists ? "Проект с такова име вече съществува!" : "Създадохте проект успешно!";
	}
}