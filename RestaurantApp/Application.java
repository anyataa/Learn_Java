package RestaurantApp;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    Locale locale = new Locale("in", "ID");
    Currency currency = Currency.getInstance(locale);
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
    Scanner input = new Scanner(System.in);
    Integer userAnswer;
    MealSet[] mealSetArray;
    FoodAndBeverage[] foodAndBeverageArray;
    Integer orderInput = 0;
    Double orderPrice;
    String orderName = "";
    Integer orderQuantity = 0;
    List<Double> totalOrderPrice = new ArrayList<>();
    List<String> totalOrderName = new ArrayList<>();
    Double totalReceipt = 0D;
    Double userPayment = 0D;
    Boolean runApp = true;
    List<Order> orderArray = new ArrayList<>();
    List<Order> orderArrayDistinct = new ArrayList<>();

    // Quantity

    public void handlePayment() {
        // Payment
        countOrder();
        System.out.println("\n\n>>>>>>>>>>> PAYMENT <<<<<<<<<<<<<");
        showOrder();
        System.out.println("Total Order : " + numberFormat.format(totalReceipt));
        System.out.println("Tax : " + numberFormat.format(0.1 * totalReceipt));
        System.out.println("Total Payment : " + numberFormat.format(totalReceipt * 1.1));
        System.out.print("Amount : ");
        userPayment = input.nextDouble();
        if (userPayment < (totalReceipt * 1.1)) {
            System.out.println("\n!!!!!!!! Insufficient Amount!!!!!!!!\nPlease Retry Your Payment ");
            handlePayment();
        }
        // Debugging
        System.out.println(userPayment + "-" + totalReceipt);
        System.out.println("Change : " + numberFormat.format(userPayment - totalReceipt));
        new Menu().generateReceipt(totalReceipt, userPayment, totalOrderName, orderArray);
        runApp = false;
        userAnswer = 3;
        showMenuOption();
    }

    public void removeItem() {
        Integer current = 1;
        System.out
                .println(">>>>>>>>>>>>>> Remove item from cart <<<<<<<<<<<<<\n Click item number to remove from cart");
        for (Order itemName : orderArray) {
            System.out.println(current + ". " + itemName.getOrderName());
            current += 1;

        }
        orderInput = input.nextInt();
        // Remove action
        orderArray.remove((orderInput.intValue() - 1));
        totalOrderName.remove((orderInput.intValue() - 1));
        totalOrderPrice.remove((orderInput.intValue() - 1));
        System.out.println("\nRemaining Item in Your Cart : ");
        showOrder();
        // System.out.println(totalOrderName);
        // System.out.println(totalOrderPrice);
        orderAgain();

    }

    public void showOrder() {
        for (Order item : orderArray) {
            System.out
                    .println("- " + item.getOrderName() + " : " + item.getOrderPrice() + " x" + item.getOrderQuantity()
                            + " = " + numberFormat.format(item.getOrderPrice() * item.getOrderQuantity()));
        }

    }

    public void orderAgain() {
        System.out.println("\n>>>>>>>>>>>>>>> Manage Order <<<<<<<<<<<<<<<<< ");
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
        for (Order orderItem : orderArray) {
            totalReceipt += (orderItem.getOrderPrice() * orderItem.getOrderQuantity());

        }
    }

    public void inputOrder(String name, Double price, Integer quantity) {
        orderName = name;
        orderPrice = price;
        // orderQuantity = quantity;
        // Append to the list
        totalOrderName.add(orderName);
        totalOrderPrice.add(orderPrice);
        orderArray.add(new Order(name, price, quantity));
        // Debugging by printing out
        // System.out.println(orderName);
        // System.out.println(orderPrice);
        System.out.println("\nItem in your Cart");
        showOrder();
        // for (Order orderItem : orderArray) {
        // System.out.println("- " + orderItem.getOrderName() + " : " +
        // (orderItem.getOrderPrice() * quantity)
        // + "\nQuantity : " + orderItem.getOrderQuantity());
        // System.out.println();
        // }

        // orderArrayDistinct =
        // orderArray.stream().distinct().collect(Collectors.toList());

        // System.out.println("DISTINCT");
        // for (Order item : orderArrayDistinct) {
        // System.out.println(item.getOrderName());
        // }
        // System.out.println(totalOrderName);
        // System.out.println(totalOrderPrice);
        System.out.println();
        countOrder();
        System.out.println("\nTotal Order : " + numberFormat.format(totalReceipt));
        // orderAgain();
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
                System.out.print("Order: ");
                orderInput = (input.nextInt() - 1);
                System.out.print("Quantity : ");
                orderQuantity = input.nextInt();
                inputOrder(mealSetArray[orderInput].getMenuName(), mealSetArray[orderInput].getMenuPrice(),
                        orderQuantity);
                orderAgain();
                // break;

            case 2:
                foodAndBeverageArray = new Menu().returnFoodAndBeverageArray();
                System.out.println(userAnswer);
                ;
                System.out.print("Order: ");
                orderInput = (input.nextInt() - 1);
                System.out.print("Quantity : ");
                orderQuantity = input.nextInt();
                inputOrder(foodAndBeverageArray[orderInput].getFoodName(),
                        foodAndBeverageArray[orderInput].getFoodPrice(), orderQuantity);
                orderAgain();
                // break;

            case 3:
                System.out.println("Thank You! See You Next Time!");
                runApp = false;
                break;
            }

        } while (runApp);
        System.out.println("Bye Bye!");
        // System.out.println(userAnswer);

    }

    public static void main(String[] args) {
        new Application().showMenuOption();
    }

}
