package uni.fmi.register.model;

import uni.fmi.register.service.RegisterService;

public class RegisterScreenModel {

	private String username;
	private String firstPassord;
	private String secondPassord;
	private String role;
	
	private String message;

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setFirstPassword(String password) {
		this.firstPassord = password;
	}

	public void setSecondPassword(String password) {
		this.secondPassord = password;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void clickRegisterButton() {
		message = RegisterService.register(username, firstPassord, secondPassord,role);
	}

	public String getMessage() {
		return message;
	}

		

}