public class Ogre extends Character {

    //attributes
    private int _HP;
    private int _strength;
    private int _defense;
    private double _attack;

    //default constructor
    public Ogre () {
	_HP = 200;
	_strength = 20 + (int) (Math.random() * 45);
	_defense = 35;
	_attack = 1;
    }

    //Accessor
    public String getName() {
    	return "Nameless MONSTARRR. Roar, snarl, hiss!";
    }
    
    public void specialize() {}
    
    public void normalize() {}
    
    public boolean critical() {
    	double chance = Math.random();
    	return chance < .25;
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
