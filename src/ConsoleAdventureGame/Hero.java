package ConsoleAdventureGame;

public class Hero {

    String name;
    int health;
    int attackPoints;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    //will take the probability method as an input and determine if punch was successful - 70% chance
    public boolean punch(int x){
        return x < 8;
    }
}
