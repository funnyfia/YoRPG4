public class Hobbit extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "Bilbo";
    private int _hitPts;
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
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
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
    
    public int getDefense() { return _defense; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }

    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
    }


    //prepare a Hobbit for a special attack
    public void specialize() {
	_attack = .75;
	_defense = 20;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .4;
	_defense = 40;
    }

    public static String about() {
	return "OOOOOOOOWEEEEEEEE!!!!!! Your stubby, hair legs will guide us on an adventure. Your green cap is askew, but you still think you look stylish. In reality, you're not the most attractive hobbit to ever be. It's okay, though. Dwalin still loves you.";
    }

    public void critical() {


}//end class Hobbit
