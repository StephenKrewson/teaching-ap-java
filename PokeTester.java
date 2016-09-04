public class PokeTester
{

	// Access | Specifier | Return type | Name
	public static void main(String[] args) {
		
		// Very simple use of CL args
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		
		// What are we trying to do here??
		// create obj with default constructor
		Pokemon x = new Pokemon();

		Pokemon z = new PokeSub();

		System.out.println(z);

		// Now we can do stuff with x
		// this just gives the memory address...
		System.out.println(x);
		
		String y = x.getName();
		
		System.out.println(y);
		
		System.out.println(x.getCombatPower());
		
		x.changeName("Pikachu");
		x.changeCP();
		
		System.out.print("Updated name and powers are: ");
		
		System.out.println(x.getName());
		System.out.println(x.getCombatPower());
		
	}


}
