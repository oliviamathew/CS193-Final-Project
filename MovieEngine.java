import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieEngine {
	
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		//code for later
	}

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
}

