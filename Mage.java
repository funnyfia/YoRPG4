public class Mage extends Character {
  
    //Attributes
    private String _name;

    //Default constructor
    public Mage( String name ) {
	super();
	_name = name;
	_HP = 175;
	_strength = 130;
	_defense = 30;
	_attack = .5
    }

    //Accessor
    public String getName() {
	return _name;
    }

    //Prepares the Mage to perform a special attack
    public void specialize() {
	_defense = 20;
	_attack = .75;
    }

    //Prepares the Mage to perform a normal attack
    public void normalize() {
	_defense = 30;
	_attack = 0.5;
    }

    public boolean critical() {
	double chance = Math.random();
	return chance < .25;
    }
    
    public static String about() {
    	return "SWOOSH SWOOSH! Your magic wand swooshes around, casting spells and stuff. Do mages even have wands? I honestly don't know. Anyhow, your swaggy, velvety cloak is so long that it falls to your feet. You could just be short, though.";
    }
  
}
