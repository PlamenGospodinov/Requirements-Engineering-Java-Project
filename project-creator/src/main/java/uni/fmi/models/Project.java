package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Project {

	 private String projectName;
	 private String projectDesciption;
	 private Participant projectCreator;
	 private Set<Task> tasks;
	 private Set<Project> children;
	 private Project parent;
	 private Set<Participant> participants;
    /**
     * Default constructor
     */
    public Project() {
    }

    
    public Project(final String name, final String description,final Participant creator) {
		this.projectName=name;
		this.projectDesciption=description;
		this.projectCreator = creator;
	}

    /**
     * @return
     */
    public String getProjectName() {
        // TODO implement here
        return projectName;
    }

    /**
     * @param name 
     * @return
     */
    public void setProjectName(String name) {
        // TODO implement here
        this.projectName = name;
    }

    /**
     * @return
     */
    public String getProjectDescription() {
        // TODO implement here
        return projectDesciption;
    }

    /**
     * @param description 
     * @return
     */
    public void setProjectDescription(String description) {
        // TODO implement here
        this.projectDesciption = description;
    }

    /**
     * @return
     */
    public Set<Task> getTasks() {
        // TODO implement here
        return tasks;
    }

    /**
     * @param tasks 
     * @return
     */
    public void setTasks(Set<Task> tasks) {
        // TODO implement here
        this.tasks = tasks;
    }

    /**
     * @return
     */
    public Project getParent() {
        // TODO implement here
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Project parent) {
        // TODO implement here
        this.parent = parent;
    }

    /**
     * @return
     */
    public Set<Project> getChildren() {
        // TODO implement here
        return children;
    }

    /**
     * @param children 
     * @return
     */
    public void setChildren(Set<Project> children) {
        // TODO implement here
        this.children = children;
    }

    /**
     * @return
     */
    public Participant getProjectCreator() {
        // TODO implement here
        return projectCreator;
    }

    /**
     * @param creator 
     * @return
     */
    public void setProjectCreator(Participant creator) {
        // TODO implement here
        this.projectCreator = creator;
    }

    /**
     * @return
     */
    public Set<Participant> getProjectParticipants() {
        // TODO implement here
        return participants;
    }

    /**
     * @param participants 
     * @return
     */
    public void setProjectParticipants(Set<Participant> participants) {
        // TODO implement here
        this.participants = participants;
    }




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Project other = (Project) obj;
		if (projectName == null) {
			if (other.projectName != null) {
				return false;
			}
		} else if (!projectName.equals(other.projectName)) {
			return false;
		}
		return true;
	}

}