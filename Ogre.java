public class Ogre extends Character {

    //attributes
    private int _HP;
    private int _strength;
    private int _defense;
    private double _attack;

    //default constructor
    public Ogre () {
	_HP = 150;
	_strength = 20 + (int) (Math.random() * 45);
	_defense = 20;
	_attack = 1;
    }

    //methods
    public boolean isAlive () {
	return _HP > 0;
    }

   public int getDefense () {
	return _defense;
    }

    public void lowerHP (int v) {
	_HP -= v;
    }

    public int attack (Warrior hero) {
	int damage = (int) (_strength * _attack) - hero.getDefense();
	if (damage < 0) { damage = 0; }
	hero.lowerHP(damage);
	return damage;
    }

    public static String about () {
	return "You are large, clumsy, thick in the head, but immensely huge. Rather than relying on any skills you may have, you use your big feet and hands to sloppily pummel your enemies.";
    }

    /*               *******FOR TESTING*******
    
    public String toString () {
	return  _HP + "\t" + _defense + "\t" + _strength + "\t" + _attack; 
    }

    public static void main (String[] args) {

	Ogre O = new Ogre();

	System.out.println(O);
	System.out.println(O.isAlive());
	System.out.println(O.getDefense());
	O.lowerHP(30);
	System.out.println(O);

    }
    */

}
