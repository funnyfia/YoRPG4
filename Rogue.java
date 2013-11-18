public class Rogue extends Character {

    //attributes
    private String _name;

    //default constructor
    public Rogue () {
	_HP = 100;
	_strength = 110;
	_defense = 35;
	_attack = 0.4;
    }

    //overload constructor
    public Rogue (String name) {
	this();
	_name = name;
    }

    //Accessor
    public String getName () {
	return _name;
    }

    public void specialize () {
	_defense = 25;
	_attack = .70;
    }

    public void normalize () {
	_defense = 35;
	_attack = 0.4;
    }
    	
    public boolean critical() {
    	double chance = Math.random();
    	return chance < .2;
    }
    
    public static String about () {
	return "You are stealthy, quick, and dextrous. You may not be the strongest hero out there, but you are definitely the smartest and most strategic. Your agility works in your favor out in the cold, dark forest. However, you are lonely. Your rogue-ess was killed by a llama just 2 months ago. You cry yourself to sleep sometimes.";
    }

    /*                *******FOR TESTING*******

    public String toString () {
	return _name + "\t" + _HP + "\t" + _defense + "\t" + _strength + "\t" + _attack; 
    }

    public static void main (String[] args) {

	Rogue User1 = new Rogue("Julie");

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
