package fr.m2i;

import java.io.Serializable;

public class Personne implements Serializable{
	
	private String _nom;
	private String _prenom;
	
	
	public Personne (String nom, String prenom){
		this.setNom(nom);
		this.setPrenom(prenom);		
	}
	
	
	public String getNom() {
		return _nom;
	}
	public void setNom(String nom) {
		this._nom = nom;
	}
	public String getPrenom() {
		return _prenom;
	}
	public void setPrenom(String prenom) {
		this._prenom = prenom;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append(getNom()).append(" ").append(getPrenom()).toString();
	}
	
	
	
	
}
