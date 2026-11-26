import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieEngine {
	
	// scanner best for looking through movie.txt. 

	
	//public static void main (String[] args) {
	//	Scanner console = new Scanner(System.in);
		//code for later
	//}

	//First make an AskLength Method

	private static int askLength() {
		while(true) {
			String text  = IO.readln("Enter max movie length in minutes: ");
			try {
				int minutes = Integer.parseInt(text);
				if (minutes > 0) {
					return minutes;
			} catch (NumberFormatException e) {
					
			}
			IO.println("Please Enter A Valid Number!");
		}
	}

	//Now try basic askText (can be used for both genre and Language since they're both Strings)
	private static String askText(String prompt) {
		while(true) {
			String response = IO.readln(prompt);
			if ( !response.isEmpty() ){
				return response;
			}
			IO.println("Please Enter A Valid Response!")
		}
	}

	private static int matchingMovies (int length, String genre, String language) {
		int matched = 0;
			Scanner in = new Scanner(newFile("movie.txt");
			while(in.hasNextLine()) {
				String line = in.nextLine().trim();
				if (line.isEmpty()) {
					continue;
				}
				String attr = line.split(",");

				String title =  attr[0];
				int movieLength = attr[1];
				String movieLang = attr[2];
				String movieGenre = attr[3]

				if (movieLength <= length && movieLang.equalsIgnoreCase(language) && movieGenre.equalsIgnoreCase(genre)){
					if (matched == 0) {
						IO.println("Showing Generated Movies: ");
					}
					IO.println(title + ": " + (movieLength / 60) + "hrs " + 
							   		(movieLength % 60) + "mins | " + movieLang + " | " + movieGenre);
					matched++;
				}
			}
			in.close();
			return matched;
	}
	
}

