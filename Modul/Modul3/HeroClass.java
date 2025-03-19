package CODELAB;

public class HeroClass extends GameCharacter { //EnemyClass has all the attributes and methods of GameCharacter, and can add or change behavior.
    public HeroClass(String Name, int Health)  {
        super(Name, Health); //This calls the constructor of the parent class (GameCharacter).
    }

    @Override //This annotation indicates that the attack method in HeroClass overrides the attack method in the parent class GameCharacter
    public void attack(GameCharacter target ) {

        System.out.println(getName() + " attack " +  target.getName() + " Using Line Up Molly!!!"); // getname takes the name of the hero object
        target.setHealth(target.getHealth() - 20); //This reduces the target character's health value by 20
        System.out.println( target.getName() + " Now Has " + target.getHealth() + " Health"); //showing the target character's health value after the attack
        System.out.println("==============");
    }
}