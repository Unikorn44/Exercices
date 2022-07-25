package fr.m2i;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Start implements Serializable{

	public static void main(String[] args) {

		Communication com = new Communication();

	    System.out.print("Combien de personnes ? ");
	
	    int nbrPersonne = com.getScan().nextInt();
	    
	    ArrayList<Personne> listPersonne = new ArrayList<>();

	    for(int i=1; i<=nbrPersonne; i++) {
	    	System.out.println("Personne n° " + i);
	    	
	    	System.out.println("Le nom est ? ");
	    	String nomPersonne = com.getScan().next();
	    	
	    	System.out.print("Le prénom est ? ");
	    	String prenomPersonne = com.getScan().next();
	    	
	    	Personne personne = new Personne(nomPersonne, prenomPersonne);
	    	listPersonne.add(personne);
	    }
		
		System.out.print(listPersonne);
		ecriture2(listPersonne);

	}
	
	
	//lecture FICHIER 
    //ECRITURE fichier
	//lecture FICHIER 
    public void lecture(){

    	try {
			//création fichier
	       FileInputStream fileIn = new FileInputStream("test.bin");
	       //sélection fichier
	       ObjectInputStream out = new ObjectInputStream(fileIn);
	       //écriture
	       ArrayList<Personne> list = (ArrayList<Personne>) out.readObject();
	       //fermeture fichier 
	       out.close();
	       fileIn.close();
	       for(Personne p: list) {
	    	   System.out.println(p.toString());
	       }
	 
	     } catch (FileNotFoundException e) {
	       e.printStackTrace();
	     } catch (IOException e) {
	       e.printStackTrace();
	     } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


	//ECRITURE fichier
	public static void ecriture2(ArrayList<Personne> listPersonne){
		
		try {
				//création fichier
		       FileOutputStream fileOut = new FileOutputStream("test.bin");
		       //sélection fichier
		       ObjectOutputStream out = new ObjectOutputStream(fileOut);
		       //écriture
		       out.writeObject(listPersonne.toString());
		       //fermeture fichier 
		       out.close();
		       fileOut.close();
		 
		     } catch (FileNotFoundException e) {
		       e.printStackTrace();
		     } catch (IOException e) {
		       e.printStackTrace();
		     }
	}

}
