package CODELAB;

public class Main { // This is the definition of the main class
    public static void main(String[] args) { //String[] args is an array containing command line arguments.

        // Create character object GeneralCharacter
        GameCharacter GeneralCharacter = new GameCharacter("General Character", 100); // Genaeral Character with 100 HP (not used in battle).
        HeroClass hero = new HeroClass("Brimstone", 150);
        EnemyClass enemy = new EnemyClass("Viper", 200);

        System.out.println("-------Initial Status-------");
        System.out.println("Brimstone" + "has health: " + hero.getHealth() +" HP"); //This prints the initial health status of the hero object.
        System.out.println("Viper" + "has health: " + enemy.getHealth() +" HP");  //hero.getHealth assumed is a method that returns the health value of a hero object.
        System.out.println();
        System.out.println("==============");

        hero.attack(enemy); //This calls the attack method on the hero object, with the enemy object as an argument
        enemy.attack(hero); //It is assumed that the attack method will reduce the health value of the enemy object.
    }


}