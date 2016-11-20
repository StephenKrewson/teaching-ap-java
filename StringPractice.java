import java.util.Scanner;

public class StringPractice
{
	public static void main( String[] args )
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = console.nextLine();

		System.out.print("Enter a pattern to search for: ");
		String pattern = console.nextLine();

		// Some stuff about indexing into strings	
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);

		System.out.println(Character.toString(first) + " | " + Character.toString(last));

		// print out str letter by letter
		for (int i = 0; i < str.length(); i++) {

			char current = str.charAt(i);
			System.out.println(Character.toString(current));
		}

		// do a simple search for pattern
		int pos = str.indexOf(pattern);

		System.out.println("Pattern occurs in str at index: " + pos);

	}
}
