public class TestPrint
{
	public static void main ( String[] args)
	{
		System.out.println( "MAX " + Integer.MAX_VALUE + "MIN " + Integer.MIN_VALUE);

		int[] myArray = {1, 2, 3, 4, 5, 6};

		for (int elem : myArray) {
			System.out.println(elem);
		}

	}
}
