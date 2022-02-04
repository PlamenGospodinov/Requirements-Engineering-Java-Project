package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Task {

	private String title;
    private String content;
    private String status;
    private Project project;
    private Participant taskAssignedPerson;
    private Set<Task> children;
    private Task parent;
    /**
     * Default constructor
     */
    public Task() {
    }

    public Task(final String title, final String content,final String status,final Participant taskAssignedPerson) {
		this.title=title;
		this.content=content;
		this.status = status;
		this.taskAssignedPerson = taskAssignedPerson;
	}
    

    /**
     * @return
     */
    public Participant getParticipant() {
        // TODO implement here
        return taskAssignedPerson;
    }

    /**
     * @param participant 
     * @return
     */
    public void setParticipant(Participant participant) {
        this.taskAssignedPerson = participant;
        
    }

    /**
     * @return
     */
    public String getTitle() {
        // TODO implement here
        return title;
    }

    /**
     * @param title 
     * @return
     */
    public void setTitle(String title) {
        // TODO implement here
    	this.title = title;
        
    }

    /**
     * @return
     */
    public String getContent() {
        // TODO implement here
        return content;
    }

    /**
     * @param content 
     * @return
     */
    public void setContent(String content) {
        // TODO implement here
    	this.content = content;
       
    }

    /**
     * @return
     */
    public String getStatus() {
        // TODO implement here
        return status;
    }

    /**
     * @param status 
     * @return
     */
    public void setStatus(String status) {
        // TODO implement here
        this.status = status;
    }

    /**
     * @return
     */
    public Task getParent() {
        // TODO implement here
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Task parent) {
        // TODO implement here
        this.parent = parent;
    }

    /**
     * @return
     */
    public Set<Task> getChildren() {
        // TODO implement here
        return children;
    }

    /**
     * @param children 
     * @return
     */
    public void setChildren(Set<Task> children) {
        // TODO implement here
        this.children = children;
    }

    /**
     * @return
     */
    public Project getProject() {
        // TODO implement here
        return project;
    }

    /**
     * @param project 
     * @return
     */
    public void setProject(Project project) {
        // TODO implement here
        this.project = project;
    }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Task other = (Task) obj;
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

}