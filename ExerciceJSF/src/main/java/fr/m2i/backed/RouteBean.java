package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class RouteBean implements Serializable {
	
	@Inject
	@ManagedProperty(value="#{param.pageId}")
	private String pageId;
	
	private static final long serialVersionUID = 1L;
	
	public String page() {
		
		if(pageId.equals("index")) {
			
			return "/index?faces-redirect=true";
		}
		if(pageId.equals("login")) {
			
			return "/pages/login?faces-redirect=true";
		}
		if(pageId.equals("about")) {
			
			return "/pages/about?faces-redirect=true";
		}
		System.out.println("Nope");
		return "/about?faces-redirect=true";
	}

}
