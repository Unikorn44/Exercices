package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;



@Named //Cette classe est à gérer par le cdi ET c'est une Bean managée aka Backed Bean 
@SessionScoped //Dispo tout au long de la requête
public class HelloBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String message = "Bonjour, soyez le bienvenu.";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String page() {
		return "/index?faces-redirect=true";
	}

}
