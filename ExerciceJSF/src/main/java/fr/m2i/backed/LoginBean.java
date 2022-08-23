package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class LoginBean  implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message = "Bonjour, veuillez vous logger.";
	
	private String login = "";
	
	private String password = "";

	public void connection() {
		System.out.println(login);
	}
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String returnAction() {
		if (this.login.equals("Sam")) {
			System.out.println("I haz da succeded !");
			return "success";
		}
		return "failed";
	}
}
