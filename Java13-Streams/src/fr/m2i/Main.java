package fr.m2i;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*Test test = new Test();
		
		test.test1();
		System.out.println("");
		test.test3();
		test.test2();*/
		
		Fichier lect = new Fichier();
		lect.test1();
		lect.test2();
		
		LectureWeb lectW = new LectureWeb();
		lectW.testURL();
		
		
	}

}
