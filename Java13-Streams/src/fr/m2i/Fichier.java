package fr.m2i;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Fichier {

	public void test1(){
		
		Reader reader = new StringReader("Hello Kitty");
		
		int caractere;
		
		try {
			while((caractere = reader.read()) !=-1) {
				System.out.print((char) caractere);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void test2() throws IOException{
		
		//lecture fichier 
		Reader reader = new FileReader("c://test.txt");
		char[] buffer = new char[1024];
		
		int nbRead;
		
		while((nbRead = reader.read(buffer)) !=-1) {
			
		}
		
		//sortie console
		StringWriter writer = new StringWriter();
		writer.append("I haz Kitty");
		String result = writer.toString();
		System.out.println(result);
		
		
		//FILE WRITER
		//Si TRUE => ajout SANS écraser le fighier
		try(Writer writer2 = new FileWriter("c://test2.txt", true)){
			writer2.append(" START !!! ");
			writer2.append("Hi ");
			writer2.append("Hi ");
			writer2.append("Hi ");
			writer2.append("Hi ");
			writer2.append("Hi ");
		}
	}

	//lecture fichier avec buffer - décorateurs -
	public void test3() {
		try(Writer writer = new BufferedWriter(new FileWriter("", true), 1024)){
			writer.append("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//décotateurs -suite -
	/*public void test4() {
		String file = " ";
		
		Reader inputTypeStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-");
		
		try(lineNumberReader reader = new lineNumberReader(inputTy))
	}*/
	//Décorateur permet éviter usage lecture bit à bit
	
	public void test4() {
		
		//lecture et import de l'entrée console jusqu'à la touche "entrée"
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		//ne pas oublier de le fermer
		scan.close();
	}
	
	public void test5() {
		Path fichier = Paths.get("test.txt");
		
		//Files.
		
	}
}
