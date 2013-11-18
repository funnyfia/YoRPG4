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
