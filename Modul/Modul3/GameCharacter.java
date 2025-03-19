package CODELAB;

public class GameCharacter {
    //This declares a private instance variable named Name which is of type String
    private String Name;  //means this variable can only be accessed from within the GameCharacter class
    private int Health;  //This declares a private instance variable named Health of type int

    public GameCharacter(String name, int health) { //the GameCharacter class the constructor is used to create a new object of this class
        this.Name = name; //This sets the value of the name parameter to the Name instance variable
        this.Health = health; //This sets the value of the health parameter to the Health instance variable
    }
    public String getName() {  //this is a getter method for the Name variable
        return Name;
    }
    public void setName(String name) { //This is the setter method for the Name variable.
        Name = name;
    }
    public int getHealth() { //This is a getter method for the Health variable.
        return Health;
    }
    public void setHealth(int health) {
        Health = health;
    }
    public void attack(GameCharacter target) { //This is where the attack logic between the two game characters will be implemented.

    }
}
