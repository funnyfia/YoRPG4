/*=============================================
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG

  A Monster is a Character, and thus has all the attributes and 
  capabilities of a Character -- and then some (possibly).
  A Monster's attributes -- along with the way it does things -- 
  set it apart from other types of Characters.
  The defining attributes of a Monster, and the way it goes about 
  doing things, are specified below. Read on!
  =============================================*/

public class Monster extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // inherited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Monster() {
        super();
        _HP = 150;
        _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
        _defense = 20;
        _attack = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { 
        return "Nameless MONSTARRR. Roar, snarl, hiss!"; 
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    //"prepare" a Monster for a special attack
    public void specialize() { }

    public void normalize() { }

    public boolean critical() {
        double chance = Math.random();
        return chance < .15;
    }

    public static String about() {
        return "Damn, son. You one ugly monster. Your skin is hot pink. What intimidating monster has hot pink skin? You really gotta get it together. Although, your face does get the monstrous message across: 19 eyes, one nostril, and no teeth. *Shudder* You nasty. No offense.";
        }
        
}//end class Monster
