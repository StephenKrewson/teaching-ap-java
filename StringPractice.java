import java.util.Scanner;

public class StringPractice
{
	public static void main( String[] args )
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String sentence = console.nextLine();

		System.out.print("Enter a word to search for: ");
		String word = console.nextLine();

	
		// tools: indexOf, substring, ...

		// this is the index of where "word" occurs in "sentence" (it's just a number)
		int firstPos = sentence.indexOf(word);

		if (firstPos == -1) {
			// the word doesn't occur in sentence!
			System.out.println("NOT FOUND");
			System.out.println(sentence);
		}
		else {

			// two other scenarios!
			// use substring to only look at the part of the sentence to the RIGHT of the first match
			// substring(start,end)
			// substring(start) -- this just gives the rest of the string starting at postiion "start"
			String afterMatch = sentence.substring(firstPos + word.length());

			// now what??
			int secondPos = afterMatch.indexOf(word);

			// (1) the "word" occurs back to back in "sentence"
			if (secondPos == 0) {
				// two in a row!
				System.out.println("TWICE");
				// print sentence with double word removed

				// (a) print out the left part (before the cut)
				System.out.print(sentence.substring(0,firstPos));

				// (b) print out the stuff after the cut (cut == place where word was)
				System.out.println(sentence.substring(firstPos + 2 * word.length()));

				//x x A B A B y y y y A B z
				//0   fp                  (sentence.length() - 1)
	
			

			}
			else {
				// (2) we only found one occurrence of "word" in "sentence"
				System.out.println("ONCE");

				System.out.print(sentence.substring(0,firstPos));

				System.out.println(sentence.substring(firstPos + word.length()));
				
			}


			//System.out.println(afterMatch);
			
			//xxABC ABCyyyy
			//AByyyy

		}

	}
}
