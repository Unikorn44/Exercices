package fr.m2i;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;




public class LectureWeb {

	public void testURL() throws UnsupportedEncodingException, IOException {
		
		//création objet url
		String ville = "Paris";
		URL url = null;
		try {
			url = new URL("https://www.prevision-meteo.ch/services/json/" + ville);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//connection
		URLConnection connection = null;
		try {
			connection = url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//encodage
		String encodage = Objects.toString(connection.getContentEncoding(), "Iso-8859-1");
		
		//création reader
		Reader reader = new InputStreamReader(connection.getInputStream(), encodage);
		
		//lecture fichier à l'URL
		try(LineNumberReader linNumberReader = new LineNumberReader(reader)){
			String line;
			while((line = linNumberReader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("Nbre lignes : " + linNumberReader.getLineNumber());
		}
	}
		
}
