public class Foo
{
	// Info that will never change
	public static final int YEAR_WRITTEN = 2016;

	// "Information hiding" for this-class-specific values
	private static double rate = 3.14159;

	// Fields !
	private String color;
	private double speed;

	// Name for default construct simple IS the class name
	public Foo() {
		color = "";
		speed = rate;
	}

	// Give a Foo object (Pokemon?) a color
	// Mutator: 

	// Accessor: color
	public String getColor() {
		return color;
	}

	// Accessor: speed
	public double getSpeed() {
		return speed;
	}
}
