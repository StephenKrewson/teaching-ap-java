import java.awt.*;
import java.util.Scanner;

import javax.swing.JFrame;

public class Hangman 
{

	public static void main(String[] args) 
	{
		int goodGuess = 0;
		int badGuess = 0;
		int count = 0;
		boolean ifGoodGuess = false;
		boolean ifBadGuess = false;
		String allGuesses = " ";
		int substitutions = 0;
		boolean gameOver = false;
		char guess = ' ';
		char guess2 = ' ';
		Scanner console = new Scanner(System.in);
		String displayString = "";
		System.out.println("Enter secret word");
		String secretWord = console.nextLine();
		for (int i = 0; i < secretWord.length(); i++)
		{
			displayString = displayString + '_';
		}

		while (!gameOver)
		{	
			ifGoodGuess = false;
			String tempDisplayString ="";
			System.out.println("");
			System.out.println("Guess a letter");
			String guessString = console.nextLine();
			guess = guessString.charAt(0);
			for(int loop = 0; loop < secretWord.length(); loop ++)
			{
				if(secretWord.charAt(loop) == guess)
				{
					goodGuess ++;
					ifGoodGuess = true;
					displayString = displayString.substring(0, loop) + guess + 
							displayString.substring(loop + 1);
				}
				else if (secretWord.charAt(loop) == guess)
				{
					ifGoodGuess = true;
					count++;
				}
			}
			System.out.println(displayString);
			System.out.println(secretWord.length() - count + 1);
//			if (secretWord.indexOf(guess) != -1) && (allGuesses.indexOf(guess) == -1) && (guess) == -1)
//&& (guess!='')))
//
//{
//	System.out.println("wrong");
//}
		}
	}
}



