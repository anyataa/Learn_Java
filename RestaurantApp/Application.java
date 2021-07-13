package RestaurantApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner input = new Scanner(System.in);
    Integer userAnswer;
    MealSet[] mealSetArray;
    FoodAndBeverage[] foodAndBeverageArray;
    Integer orderInput = 0;
    Double orderPrice;
    String orderName = "";
    List<Double> totalOrderPrice = new ArrayList<>();
    List<String> totalOrderName = new ArrayList<>();
    Double totalReceipt = 0D;
    Double userPayment = 0D;
    Boolean runApp = true;

    public void handlePayment() {
        // Payment
        countOrder();
        System.out.println("\n\n>>>>>>>>> PAYMENT <<<<<<<<<<<<<");
        System.out.println("Total : " + totalReceipt);
        System.out.print("Amount : ");
        userPayment = input.nextDouble();
        if (userPayment < totalReceipt) {
            System.out.println("Insufficient Amount!\nPlease Retry Your Payment");
            handlePayment();
        }
        System.out.println(userPayment + "-" + totalReceipt);
        System.out.println("Change : " + (userPayment - totalReceipt));
        new Menu().generateReceipt(totalReceipt, userPayment, totalOrderName);
        showMenuOption();
    }

    public void removeItem() {
        Integer current = 1;
        System.out.println("Remove item from cart\n Click item number to remove from cart");
        for (String itemName : totalOrderName) {
            System.out.println(current + ". " + itemName);
            current += 1;

        }
        orderInput = input.nextInt();
        totalOrderName.remove((orderInput.intValue() - 1));
        totalOrderPrice.remove((orderInput.intValue() - 1));
        System.out.println(totalOrderName);
        System.out.println(totalOrderPrice);

    }

    public void orderAgain() {
        System.out.println("Manage Order ");
        System.out.println("[1] Order Again \n[2] Remove Item from Cart \n[3] Cancel Order \n[4] Check Out and Pay");
        userAnswer = (input.nextInt());
        if (userAnswer == 1) {
            showMenuOption();
        }
        if (userAnswer == 2) {
            removeItem();
        }
        if (userAnswer == 3) {
            System.out.println("Order Cancelled");
            totalOrderName.clear();
            totalOrderPrice.clear();
            showMenuOption();
        }
        if (userAnswer == 4) {
            handlePayment();
        }

    }

    public void countOrder() {
        totalReceipt = 0D;
        for (Double orderPriceEach : totalOrderPrice) {
            totalReceipt += orderPriceEach;

        }
    }

    public void inputOrder(String name, Double price) {
        orderName = name;
        orderPrice = price;
        // Append to the list
        totalOrderName.add(orderName);
        totalOrderPrice.add(orderPrice);
        // Debugging by printing out
        System.out.println(orderName);
        System.out.println(orderPrice);
        System.out.println("\nItem in your Cart");
        System.out.println(totalOrderName);
        System.out.println(totalOrderPrice);
        countOrder();
        System.out.println("\nTotal : " + totalReceipt);
        orderAgain();
    }

    public void showMenuOption() {
        // Header
        System.out.println("\nWelcome to J-MCD!\n What are you craving for today?\n Option:");
        System.out.println("[1] Meal Set \n[2] Ala Carte\n[3] Exit");
        userAnswer = input.nextInt();
        do {
            switch (userAnswer) {
            case 1:
                mealSetArray = new Menu().returnMealSetArray();
                System.out.print("Input: ");
                orderInput = (input.nextInt() - 1);
                inputOrder(mealSetArray[orderInput].getMenuName(), mealSetArray[orderInput].getMenuPrice());
                orderAgain();
                // break;

            case 2:
                foodAndBeverageArray = new Menu().returnFoodAndBeverageArray();
                System.out.print("Input: ");
                orderInput = (input.nextInt() - 1);
                inputOrder(foodAndBeverageArray[orderInput].getFoodName(),
                        foodAndBeverageArray[orderInput].getFoodPrice());
                orderAgain();
                // break;

            case 3:
                System.out.println("Thank You! See You Next Time!");
                runApp = false;
            }

            // if (userAnswer == 1) {

            // }
            // if (userAnswer == 2) {

            // }
            // if (userAnswer == 3) {

            // }
        } while (runApp);
        // System.out.println("KENAPA GAMAU KE SINI????");
        // System.out.println(userAnswer);

    }

    public static void main(String[] args) {
        new Application().showMenuOption();
    }

}
