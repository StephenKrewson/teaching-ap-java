import java.util.Arrays;

public class TestPrint
{
	public static void main ( String[] args)
	{
		// Max for int is: 2^31 - 1 (because of zero!)
		System.out.println( "MAX\t\t\t" + (Integer.MAX_VALUE + 1000) + "\nMIN\t\t\t" + Integer.MIN_VALUE);

		// Some Array examples
		int[] myArray = {1, 2, 3, 4, 5, 6};
		double[] yourArray = {1, 2, 3, 4, 5, 6};
		
		myArray[5] = (int) (3.88777777 + 0.5);

		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(yourArray));
		
		// Setting an array with bounds
		// need "new" keyword (reserved) since we aren't explicitly
		// declaring and filling up the object, as with myArray.
		final int MAX_ARRAY = 30;
	
		int[] bigArray = new int[MAX_ARRAY];

		// how to write into an array
		
		bigArray[0] = Integer.MAX_VALUE; 
		bigArray[29] = (int) Math.PI;
		
		// what type?
		//Math.PI

		System.out.println(Arrays.toString(bigArray));

		// "for each" loop
		for (int elem : myArray) {
			System.out.println(elem);
		}
		
		// "for" loop
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		// Division by 0
		System.out.println("5 / 0 = " + (5 / 0));

	}
}
