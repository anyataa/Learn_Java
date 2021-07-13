package RestaurantApp;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;

import java.util.List;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public class Menu implements OrderHandler {

    Locale locale = new Locale("in", "ID");
    Currency currency = Currency.getInstance(locale);
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    // 1 Meal Set Menu Generator
    public MealSet[] returnMealSetArray() {
        // Iterate key for each meat set

        Integer current = 0;
        // Generate Meal Set : Food & Beverage List
        String[] BtsMeal = { "Chicken Nuggets (2pcs)", "French Fries" };
        String[] BffMeal = { "Cola", "Chicken Nuggets (4pcs)", "French Fries", "Rice" };
        String[] HappyMeal = { "Milo", "Chicken Nuggets (4pcs)", "Finger Bites", "French Fries", "Burger" };
        // Header for Meal Set
        System.out.println();
        System.out.println("Choose Your Meal Set: ");
        // Put Meal Set inside the array
        MealSet[] mealSetArray = { new MealSet("BTS Meal", 49000D, BtsMeal), new MealSet("BFF Meal", 99000D, BffMeal),
                new MealSet("Happy Meal", 105000D, HappyMeal) };
        for (MealSet mealElement : mealSetArray) {

            System.out.println((current + 1) + ". " + mealElement.getMenuName() + " : "
                    + numberFormat.format(mealElement.getMenuPrice()));
            for (String menuItem : mealElement.getMenuList()) {
                System.out.println(menuItem);
            }
            System.out.println();
            current += 1;

        }
        return mealSetArray;
    }

    // 2 Ala Carte Food and Beverage Generator

    public FoodAndBeverage[] returnFoodAndBeverageArray() {
        Integer current = 0;
        // Header for Meal Set
        System.out.println();
        System.out.println("Choose Your Ala Carte Food & Beverage : ");
        FoodAndBeverage[] FoodAndBeverageArray = { new FoodAndBeverage("Spicy Chicken", 20000D),
                new FoodAndBeverage("Nuggets (5pcs)", 19000D), new FoodAndBeverage("Porridge", 15000D),
                new FoodAndBeverage("Cola", 11000D), new FoodAndBeverage("Milo", 13000D) };

        for (FoodAndBeverage foodElement : FoodAndBeverageArray) {
            System.out.println((current + 1) + ". " + foodElement.getFoodName() + " : "
                    + numberFormat.format(foodElement.getFoodPrice()));
            System.out.println();
            current += 1;
        }
        return FoodAndBeverageArray;

    }

    public static void main(String[] args) {
        new Menu().returnMealSetArray();
        new Menu().returnFoodAndBeverageArray();

    }

    @Override
    public void generateReceipt(Double total, Double payment, List<String> orderList) {
        // TODO Auto-generated method stub
        System.out.println("\n\n>>>>>>>>> RECEIPT <<<<<<<<<<<<<\n");

        for (String orderItem : orderList) {
            System.out.println("-" + orderItem);
        }

        System.out.println("Total : " + numberFormat.format(total));
        System.out.println("Payment : " + numberFormat.format(payment));
        System.err.println("Change : " + numberFormat.format(payment - total));
    }

    // Order Handler Delegate

}
