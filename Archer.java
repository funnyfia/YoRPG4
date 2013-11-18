public class Archer extends Character {

    //attributes
    private String _name;
    private int _HP;
    private int _strength;
    private int _defense;
    private double _attack;

    //default constructor
    public Archer () {
	_HP = 125;
	_strength = 40;
	_defense = 100;
	_attack = 0.4;
    }

    //overload constructor
    public Archer (String name) {
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
