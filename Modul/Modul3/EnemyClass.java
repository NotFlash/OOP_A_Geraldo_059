package CODELAB;

public class EnemyClass extends GameCharacter {
    public EnemyClass(String Name, int Health)  {
        super(Name, Health); // calls the constructor of the parent class (GameCharacter)
    }

    @Override //changing method implementation
    public void attack(GameCharacter target ) {

        System.out.println(getName()+" attack " + target.getName() + " Using Line Up Snake Bite! "); //message to the console indicating that an enemy character is attacking the target character
        target.setHealth(target.getHealth() - 15); //target.getHealth(): gets the health value of the target object
        System.out.println(target.getName()+ " Now Has "+ target.getHealth() + " Health"); // a message to the console showing the target character's health value after the attack.
        System.out.print("---------------------------------------");
    }
}