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
    // unused
    List<Double> totalOrderPrice = new ArrayList<>();
    List<String> totalOrderName = new ArrayList<>();
    Double totalReceipt = 0D;
    Double userPayment = 0D;
    Boolean runApp = true;
    List<Order> orderArray = new ArrayList<>();
    // List<Order> orderArrayDistinct = new ArrayList<>();

    // 5
    public void handlePayment() {
        // Payment
        countOrder();
        System.out.println("\n\n>>>>>>>>>>> PAYMENT <<<<<<<<<<<<<");
        showOrder();

        System.out.println("\nTotal Order : " + numberFormat.format(totalReceipt));
        System.out.println("Tax : " + numberFormat.format(0.1 * totalReceipt));
        System.out.println("Total Payment : " + numberFormat.format(totalReceipt * 1.1));
        System.out.print("Amount : ");
        userPayment = input.nextDouble();
        // int compare = Double.compare(userPayment, totalReceipt);
        if (userPayment < totalReceipt) {
            System.out.println("\n!!!!!!!! Insufficient Amount!!!!!!!!\nPlease Retry Your Payment ");
            handlePayment();
        }
        // Debugging
        System.out.println(userPayment + "-" + totalReceipt);
        System.out.println("Change : " + numberFormat.format(userPayment - totalReceipt));

        new Menu().generateReceipt(totalReceipt, userPayment, totalOrderName, orderArray);
        // System.out.println(orderArray.get(0).getOrderName());
        runApp = false;
        userAnswer = 3;
        orderArray.clear();
        showMenuOption();

    }

    // 4
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
        orderAgain();

    }

    // Function
    public void showOrder() {
        for (Order item : orderArray) {
            System.out
                    .println("- " + item.getOrderName() + " : " + item.getOrderPrice() + " x" + item.getOrderQuantity()
                            + " = " + numberFormat.format(item.getOrderPrice() * item.getOrderQuantity()));
        }

    }

    // 3
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
            orderArray.clear();
            totalOrderName.clear();
            totalOrderPrice.clear();
            showMenuOption();

        }
        if (userAnswer == 4) {
            handlePayment();

        }

    }

    // Function
    public void countOrder() {
        totalReceipt = 0D;
        for (Order orderItem : orderArray) {
            totalReceipt += (orderItem.getOrderPrice() * orderItem.getOrderQuantity());

        }
    }

    // 2
    public void inputOrder(String name, Double price, Integer quantity) {
        orderName = name;
        orderPrice = price;
        // Append to the list
        totalOrderName.add(orderName);
        totalOrderPrice.add(orderPrice);
        orderArray.add(new Order(name, price, quantity));
        // System.out.println(orderArray);
        System.out.println("\nItem in your Cart");
        showOrder();
        System.out.println();
        countOrder();
        System.out.println("\nTotal Order : " + numberFormat.format(totalReceipt));
        orderAgain();
    }

    // 1
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
                if (orderInput > mealSetArray.length) {
                    System.out.println("Unavailable Option! Please choose the valid Option");
                    System.out.print("Order: ");
                    orderInput = (input.nextInt() - 1);
                }
                System.out.print("Quantity : ");
                orderQuantity = input.nextInt();
                inputOrder(mealSetArray[orderInput].getMenuName(), mealSetArray[orderInput].getMenuPrice(),
                        orderQuantity);

            case 2:
                if (userAnswer == 3) {
                    break;
                }
                foodAndBeverageArray = new Menu().returnFoodAndBeverageArray();
                System.out.println(userAnswer);
                System.out.print("Order: ");
                orderInput = (input.nextInt() - 1);
                if (orderInput > foodAndBeverageArray.length) {
                    System.out.println("Unavailable Option! Please choose the valid Option");
                    System.out.print("Order: ");
                    orderInput = (input.nextInt() - 1);
                }
                System.out.print("Quantity : ");
                orderQuantity = input.nextInt();
                inputOrder(foodAndBeverageArray[orderInput].getFoodName(),
                        foodAndBeverageArray[orderInput].getFoodPrice(), orderQuantity);

            case 3:
                System.out.println("Thank You! See You Next Time!");
                runApp = false;

            }

        } while (runApp);
        System.out.println("Bye Bye!");
        // System.out.println(userAnswer);

    }

    public static void main(String[] args) {
        new Application().showMenuOption();
    }

}
