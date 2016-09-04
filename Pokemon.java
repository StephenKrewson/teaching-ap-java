import java.lang.Math;

public class Pokemon {
	
	// Fields (state/data about the obj)
	private String name;
	private int combatPower;
	
	// Constant, default values
	public static final int YEAR_CREATED = 2016;

	// TODO: create some limits for CP
	// then we will make a static method for checking in the subclass
	// which we call as Pokemon.isValidCP()
	// we will also make changeCP polymorphic

	// Create the obj with a CONSTRUCTOR
	public Pokemon() {
		
		// Initialize the fields
		name = "";
		combatPower = 0;
		
	}
	
	// TODO... Accessor methods!
	public String getName() {
		return name;
	}
	
	public int getCombatPower() {
		return combatPower;
	}
	
	// Mutator methods...
	public void changeName(String newName) {
		name = newName;
	}
	
	public void changeCP() {
		combatPower = (int) Math.floor(Math.random() * 100);
	}
	
}
