package builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showItems();
        System.out.println("Total cost:" + vegMeal.getPrice());

        Meal nonVegMeal = builder.prepareVegMeal();
        System.out.println("Non-Veg Meal:");
        nonVegMeal.showItems();
        System.out.println("Total cost:" + nonVegMeal.getPrice());
    }
}
