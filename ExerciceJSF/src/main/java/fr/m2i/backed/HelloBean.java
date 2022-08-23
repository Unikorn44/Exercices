package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;



@Named //Cette classe est à gérer par le cdi ET c'est une Bean managée aka Backed Bean 
@RequestScoped //Dispo tout au long de la requête
public class HelloBean implements Serializable {
	
	//injection de dépendance
	//regarder méthode page()
	@Inject
	@ManagedProperty(value= "#{param.pageId}")
	private String pageId;
		
	private static final long serialVersionUID = 1L;
	
	private String message = "Bonjour, soyez le bienvenu.";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String page() {
		
		System.out.println("Dat Login iz : " + pageId);
		System.out.println("Equals is ? " + pageId.equals("login"));

		if(pageId.equals("index")) {
			System.out.println("letz go to... " + pageId);
			return "/index?faces-redirect=true";
		}
		if(pageId.equals("login")) {
			System.out.println("letz go to... " + pageId);
			return "/pages/login?faces-redirect=true";
		}
		if(pageId.equals("about")) {
			System.out.println("letz go to... " + pageId);
			return "/pages/about?faces-redirect=true";
		}
		System.out.println("Nope");
		return "/about?faces-redirect=true";
	}

}
