package fr.m2i;

import java.util.Scanner;

public class Communication {

	private Scanner scan;
	
	public Communication() {
		this.setScan(new Scanner(System.in));
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}
		
	
	    
}
