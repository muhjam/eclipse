package case_stack;
import java.io.IOException;
import java.util.*;
public class PostFIxApp {
	public static void main(String[] args) {
		String input;
		int output;
		
		while(true) {
			  try {
				  System.out.print("Enter postfix: ");
					System.out.flush();
					input = getString();
					if (input.equals(""))
						break;
						
						ParsePost aParser = new ParsePost(input);
						output = aParser.doParse();
						System.out.println("Hasil oprasi: "+ output);
		        } catch (IOException e) {
		            System.out.println("Error reading input. Please try again.");
		        }
			
		}	
	}
	
	public static String getString() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return s;
	}

}
