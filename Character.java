/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG

  Ye Olde Adventure Land is populated by a wide variety of characters.
  One may encounter, for instance, warriors, mages, archers, rogues,
  healers, clerics, fairies, or even monsters of assorted shapes and sizes.
  However, there are certain things all of these entities have in common.
  These commonalities are expressed below. Read on!
  =============================================*/	

public abstract class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected int _HP;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
        _HP = 125;
        _strength = 100;
        _defense = 40;
        _attack = .4;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }

    public abstract String getName();
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
        return _HP > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on instance of class Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
            Calls opponent's lowerHP() method to inflict damage. 
            Returns damage dealt.
      =============================================*/
    public int attack( Character opponent ) {

        int damage = (int)( (_strength * _attack) - opponent.getDefense() );
        //System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( critical() == true ) {
	    damage = damage * 2;
	}
            
        if ( opponent.dodge() == true ) {
            damage = 0;
        }
        
        if ( damage < 0 )
            damage = 0;

        opponent.lowerHP( damage );

        return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
        _HP = _HP - damageInflicted;
    }


    /*=============================================
      void specialize() -- prepare a character to deliver a special attack
      pre:  n/a
      post: varies by class
      =============================================*/
    public abstract void specialize();


    /*=============================================
      void normalize() -- reset a character to normal mode
      pre:  n/a
      post: varies by class
      =============================================*/
    public abstract void normalize();

    /*=============================================
      void critical() -- chance of landing a critical hit depends on Character and doubles the damage done on opponent
      =============================================*/
 
    public abstract boolean critical();
    
    /*=============================================
      boolean dodge() -- 1/20 chance of dodging an attack. aw yeah
      ============================================*/
    public boolean dodge() {
	return Math.random() < .2;
    }
	

    /*=============================================
      String about() -- gives a categorical description of a type of entity
      pre:  
      post: returns String describing this class
      =============================================*/
    public static String about() { 
        //boilerplate text, should a subclass not override this method
        return "Random RPG character, capable of many things.";
    }


}//end class Character
