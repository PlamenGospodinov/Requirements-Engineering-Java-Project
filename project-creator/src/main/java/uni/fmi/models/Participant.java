package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Participant {

	 private String username;
	 private String password;
	 private String role;
	 private Set<Task> tasks;
	 private Set<Project> projects;
    /**
     * Default constructor
     */
    public Participant() {
    }

    public Participant(final String username, final String password,final String role) {
		this.username=username;
		this.password=password;
		this.role = role;
	}
    
    public Participant(final String username) {
		this.username=username;
	}

    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return username;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Participant other = (Participant) obj;
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}

	/**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        // TODO implement here
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        // TODO implement here
        this.password = password;
    }

    /**
     * @return
     */
    public String getRole() {
        // TODO implement here
        return role;
    }

    /**
     * @param roles 
     * @return
     */
    public void setRole(String role) {
        // TODO implement here
       this.role = role;
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
    public Set<Project> getProjects() {
        // TODO implement here
        return projects;
    }

    /**
     * @param projects 
     * @return
     */
    public void setProjects(Set<Project> projects) {
        // TODO implement here
        this.projects = projects;
    }

}