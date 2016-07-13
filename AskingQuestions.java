import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int myInt;
		String myString;
		double myDouble;

		System.out.print( "Please enter an int: " );
		myInt = keyboard.nextInt();

		System.out.print( "Please enter anything (interpreted as string): " );
		myString = keyboard.next();

		System.out.print( "Please enter a double: " );
		myDouble = keyboard.nextDouble();

		System.out.println( "Int = " + myInt + " String = " + myString + " Double = " + myDouble );

		System.out.println( Math.pow(myInt, 0.5) + "\n" + Math.sqrt(myInt) );

		// Start of CS50 mario game
		System.out.print("How high should your Mario mountain be? ");
		int mario = keyboard.nextInt();

		for (int i = 1; i <= mario; i++) {

			for (int j = 0; j < (mario - i); j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}
}
