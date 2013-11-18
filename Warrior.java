public class Warrior extends Character {

    //Attributes
    private String _name;

    //Default constructor
    public Warrior() {
        _HP = 125;
	_strength = 100;
	_defense = 40;
	_attack = 0.4;
    }

    //Overload constructor
    public Warrior( String name ) {
	this();
	_name = name;
    }

    //Accessor
    public String getName() {
	return _name;
    }

    //Prepares the Mage to perform a special attack
    public void specialize() {
	_defense = 20;
	_attack = 0.75;
    }

    //Prepares the Mage to perform a normal attack
    public void normalize() {
	_defense = 40;
	_attack = 0.4;
    }

    public boolean critical() {
	double chance = Math.random();
	return chance < .2;
    }
    
    public static String about() {
        return "You're one of the most heroic heroes that I ever did see. Your dark, silky hair shines under the sunlight and rustles in the wind. Your well defined muscles stand out due to the cocoa butter you rubbed all over them this morning. Congrats. Ya look fab.";
    }
}
