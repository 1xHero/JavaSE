package source;

public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("####- VEGAN MEAL -####");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost() + "\n");

        Meal chickMeal = mealBuilder.prepareChickenMeal();
        System.out.println("####- CHICKEN MEAL -####");
        chickMeal.showItems();
        System.out.println("Total Cost: " + chickMeal.getCost());

    }
}
