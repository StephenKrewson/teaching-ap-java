import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner console = new Scanner(System.in);

		// for the test, don't need to define this since it's a given
		final int NUM_ENTRIES = 5;
		final int MIN_GOOD = 0;
		final int MAX_GOOD = 100;

		// NOTE: from here is the actual stuff we will need for exam
		int goodEntries = 0;
		double sumGood = 0;
		double sumAll = 0;
		

		for (int i = 0; i < NUM_ENTRIES; i++) {

			System.out.print("Please enter a double: ");
			double val = console.nextDouble();

			if (val <= MAX_GOOD && val >= MIN_GOOD) {
				// this is a good one!
				goodEntries++;
				sumGood = sumGood + val;
			}
			
			sumAll = sumAll + val;
		}

		double averageAll = sumAll / NUM_ENTRIES; 

		System.out.println("Total sum: " + sumAll);
		System.out.println("Average of all entries: " + averageAll);
		System.out.println("Number of GOOD entries: " + goodEntries);
		System.out.println("Sum of GOOD entries: " + sumGood);

	}
}
