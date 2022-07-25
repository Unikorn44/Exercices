package fr.m2i;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Binaire {

	//lecture octet par octet
	public void test1(){
			// TODO Auto-generated method stub

			byte[] tab ="Hello Kitty".getBytes();
			
			ByteArrayInputStream stream = new ByteArrayInputStream(tab);
			int octet;
			
			while((octet = stream.read()) !=-1) {
				System.out.println((char)octet);
				System.out.println(" ");
			}
		
	}
	
	
	//lecture FICHIER 
	public void test2(){
		
		try(InputStream stream2 = new FileInputStream("c://test.txt")){
			byte[] buffer = new byte[1024];
			int nbRead;
			while((nbRead = stream2.read(buffer)) !=-1) {
				for(int i=0; i<nbRead; i++) {
					System.out.print((char)buffer[i]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//ECRITURE fichier
	public void test3(){
		
		try(FileOutputStream stream3 = new FileOutputStream("c://test.txt")){
			byte[] tab ="Ich liebe die kleine Kitty".getBytes();
			stream3.write(tab);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
