package fr.m2i.backed;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

@Named
@RequestScoped
public class AboutBean {

	private String message = "I haz secret !";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String pageAbout() {
		return "/pages/about?faces-redirect=true";
	}
}
