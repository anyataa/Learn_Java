package Interface;

import java.util.Scanner;

public class Application {
    Scanner input = new Scanner(System.in);
    Double in1;
    Double in2;
    Integer menuChoice;

    public void inputHandler() {
        System.out.println();
        System.out.println("Want to Draw Geometry");
        System.out.println("Click 1 : for Triangle");
        System.out.println("Click 2 : for Rectangle");
        System.out.println("Click 3 : for Circle");
        System.out.print("Your Choice : ");
        menuChoice = input.nextInt();
        switch (menuChoice) {
        case 1:
            inputTwoType();
            new RightTriangle().drawShape(in1, in2);
            break;
        case 2:
            inputTwoType();
            new Rectangle().drawShape(in1, in2);
            break;
        case 3:
            inputOneType();
            new Circle().drawShape(in1, in2);
            break;

        }
        System.out.println("Draw geometry again?");
        System.out.println("Click 1 : to draw again");
        System.out.println("Click 2 : to draw again");
        System.out.print("Your Choice : ");
        menuChoice = input.nextInt();
        if (menuChoice == 1) {
            inputHandler();
        } else {

        }

    }

    public void inputTwoType() {
        System.out.println();
        System.out.println("Input Width: ");
        in1 = input.nextDouble();
        System.out.println("Input Height: ");
        in2 = input.nextDouble();
        System.out.println();
    }

    public void inputOneType() {
        System.out.println();
        System.out.println("Input Radius: ");
        in1 = input.nextDouble();
        System.out.println();
    }

    public static void main(String[] args) {
        new Application().inputHandler();

    }

}
