public class Dish {
//    -- OOP SHORT ASSIGNMENT #1 --
////    Create a class called Dish. This class will represent various restaurant dishes.
////    Include an integer property called "costInCents"
////    Include a string property called "nameOfDish"
////    Include a boolean property called "wouldRecommend"
////    Include a method called "printSummary" with a void return type
////    this method will use a single printf method to print out the values of each of the instance properties in the following format:
////    Cost: COST_IN_CENTS_HERE
////    Name: NAME_OF_DISH_HERE
////    Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    //Setter for costInCents
    public void setCostInCents(int num) {
        this.costInCents = num;
    }
    //Getter for costInCents
    public int getCostInCents() {
        return costInCents;
    }

    //Setter for nameOfDish
    public void setNameOfDish(String name) {
        this.nameOfDish = name;
    }
    //Getter for nameOfDish
    public String getNameOfDish() {
        return nameOfDish;
    }

    //Setter for wouldRecommend
    public void setWouldRecommend (boolean x) {
        this.wouldRecommend = x;
    }
    //Getter for wouldRecommend
    public boolean getWouldRecommend () {
        return wouldRecommend;
    }

    public Dish() {

    }

    public Dish(int cost, String name, boolean x) {
        this.setCostInCents(cost);
        this.setNameOfDish(name);
        this.setWouldRecommend(x);
    }

    public void printSummary(){
        System.out.printf("Name: %s\nCost: $.%d\nRecommended: %b\n", nameOfDish, costInCents, wouldRecommend);
    }


//    -- SHORT ASSIGNMENT #2 --
//    PART 1
//    Refactor your Dish and DishTest classes...
//      1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//      2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//      3) Refactor code as needed in DishTest to access and modify dish object property values
//      4) Add a constructor method to Dish that will assign all properties
//      5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
}
