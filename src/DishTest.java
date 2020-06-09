public class DishTest {
    public static void main(String[] args) {

        //Using Getters and Setters to set property values
            Dish dish1 = new Dish();

            dish1.setCostInCents(50);
            dish1.setNameOfDish("Kitchen Sink");
            dish1.setWouldRecommend(false);

            dish1.printSummary();

        //Using Getters and Setters to set property values
            Dish dish2 = new Dish();

            dish2.setCostInCents(95);
            dish2.setNameOfDish("Breakfast Taco");
            dish2.setWouldRecommend(true);

            dish2.printSummary();

        //Using Constructor to set property values
            Dish dish3 = new Dish(25, "Chips and Salsa", true);

            dish3.printSummary();

        //Using Constructor to set property values
            Dish dish4 = new Dish(66, "Chicken Strips", true);

            dish4.printSummary();

        //Using the static fields defined in the DishTools class
            DishTools.shoutDishName(dish1);

            DishTools.analyzeDishCost(dish2);
            DishTools.analyzeDishCost(dish3);

            DishTools.flipRecommendation(dish1);
            dish1.printSummary();

            DishTools.flipRecommendation(dish2);
            dish2.printSummary();
    }
}
