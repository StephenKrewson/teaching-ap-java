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
	}
}
