package uni.fmi.login.model;

import uni.fmi.login.service.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void setUsername(final String username) {
		// TODO Auto-generated method stub
		this.username = username;
	}

	public void setPassword(final String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	public void loginButtonPressed() {
		// TODO Auto-generated method stub
		message = LoginService.login(username, password);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
