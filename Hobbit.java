public class Hobbit extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "Bilbo";
    private int _HP;
    private int _strength;
    private int _defense;
    private double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Hobbit() {
	_hitPts = 130;
	_strength = 100;
	_defense = 50;
	_attack = .4;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Hobbit( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //prepare a Hobbit for a special attack
    public void specialize() {
	_attack = .75;
	_defense = 30;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .4;
	_defense = 50;
    }
    
    public boolean critical() {
    	double chance = Math.random();
    	return chance < .35;
    }

    public static String about() {
	return "OOOOOOOOWEEEEEEEE!!!!!! Your stubby, hair legs will guide us on an adventure. Your green cap is askew, but you still think you look stylish. In reality, you're not the most attractive hobbit to ever be. It's okay, though. Dwalin still loves you.";
    }

}//end class Hobbit
