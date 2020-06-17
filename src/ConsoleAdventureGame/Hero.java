package ConsoleAdventureGame;

public class Hero {

    String name;
    int health;
    int attackPoints;

    public Hero(String name) {
        this.name = name;
//        this.health = health;
//        this.attackPoints = attackPoints;
    }

    //will take the probability method as an input and determine if punch was successful - 70% chance
    public boolean punch(int x){
        return x < 8;
    }
}
