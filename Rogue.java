public class Rogue extends Character {

    //attributes
    private String _name;
    private int _HP;
    private int _strength;
    private int _defense;
    private double _attack;

    //default constructor
    public Rogue () {
	_HP = 125;
	_strength = 40;
	_defense = 100;
	_attack = 0.4;
    }

    //overload constructor
    public Rogue (String name) {
	this();
	_name = name;
    }

    //methods
    public boolean isAlive () {
	return _HP > 0;
    }

    public int getDefense () {
	return _defense;
    }

    public String getName () {
	return _name;
    }

    public void lowerHP (int v) {
	_HP -= v;
    }

    public int attack (Monster enemy) {
	int damage = (int) (_strength * _attack) - enemy.getDefense();
	if (damage < 0) { damage = 0; }
	enemy.lowerHP(damage);
	return damage;
    }

    public void specialize () {
	_defense += 1;
	_attack += 0.25;
    }

    public void normalize () {
	_defense = 100;
	_attack = 0.4;
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
