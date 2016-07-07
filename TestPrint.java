import java.util.Arrays;

public class TestPrint
{
	public static void main ( String[] args)
	{
		System.out.println( "MAX " + Integer.MAX_VALUE + "MIN " + Integer.MIN_VALUE);

		// Some Array examples
		int[] myArray = {1, 2, 3, 4, 5, 6};

		System.out.println(Arrays.toString(myArray));
		
		// Setting an array with bounds
		// need "new" keyword (reserved) since we aren't explicitly
		// declaring and filling up the object, as with myArray.
		final int MAX_ARRAY = 30;
		int[] bigArray = new int[MAX_ARRAY];

		bigArray[29] = 67;

		System.out.println(Arrays.toString(bigArray));


		for (int elem : myArray) {
			System.out.println(elem);
		}

	}
}
