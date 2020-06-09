public class DishTools {
//    Create a class of static fields (properties and methods) called DishTools
//      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000
//      - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//      - analyzeDishCost() - that takes in a Dish object and will print out either "More expensive than average" or "Less expensive than average", depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//      - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//    Try out the DishTools methods with Dish objects in the DishTest main method

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 50;

    public static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {
        if (dish.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        }else {
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(Dish dish) {
        if(dish.getWouldRecommend()) {
            dish.setWouldRecommend(false);
        }else {
            dish.setWouldRecommend(true);
        }
    }
}
