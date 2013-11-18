public class Archer extends Character {

    //attributes
    private String _name;

    //default constructor
    public Archer () {
	_HP = 100;
	_strength = 110;
	_defense = 30;
	_attack = 0.4;
    }

    //overload constructor
    public Archer (String name) {
	this();
	_name = name;
    }

    //Accessor
    public String getName () {
	return _name;
    }

    public void specialize () {
	_defense = 20;
	_attack = 0.75;
    }

    public void normalize () {
	_defense = 30;
	_attack = 0.4;
    }
    
    public boolean critical() {
    	chance = Math.random();
    	return chance < .3;
    }
    
    public static String about () {
	return "Born and raised in the forests, you find comfort hiding out among treetops and shooting down at your enemies with your beloved crossbow. However, when you're out in the open without the weapon of your choice, you don't have much going for you.";
    }
    
    /*                *******FOR TESTING*******

    public String toString () {
	return _name + "\t" + _HP + "\t" + _defense + "\t" + _strength + "\t" + _attack; 
    }

    public static void main (String[] args) {

	Archer User1 = new Archer("Julie");

	System.out.println(User1);
	System.out.println(User1.isAlive());
	System.out.println(User1.getDefense());
	System.out.println(User1.getName());
	User1.lowerHP(10);
	System.out.println(User1);
	User1.specialize();
	System.out.println(User1);
	User1.normalize();
	System.out.println(User1);

    }
    */

}
