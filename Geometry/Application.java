package Geometry;

import java.util.Scanner;

public class Application {
    Scanner input1 = new Scanner(System.in);
    int geometryChoice;
    int twoDimension;
    int threeDimension;
    int confirmationState;
    boolean isExit;
    float in1;
    float in2;
    float in3;

    public void GeometryThreeDimension() {
        System.out.println("Count Operation :");
        System.out.println("1. Area");
        System.out.println("2. Circumference");
        System.out.println("3. Volume");
        System.out.println("---------------------------------");
        this.threeDimension = input1.nextInt();
        switch (geometryChoice) {
        case 4:
            if (this.threeDimension == 1) {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("Prism Height :");
                in3 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Area : ");
                System.out.println(new TrianglePrism(in2, in1, in3).countArea());
                break;

            } else if (this.threeDimension == 2) {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("Prism Height :");
                in3 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Area : ");
                System.out.println(new TrianglePrism(in2, in1, in3).countCircum());
                break;
            } else {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("Prism Height :");
                in3 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Volume : ");
                System.out.println(new TrianglePrism(in2, in1, in3).countVolume());
                break;
            }

        case 5:

            if (this.threeDimension == 1) {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("Cuboid Height :");
                in3 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println(new RectangleCuboid(in2, in1, in3).countArea());
                break;

            } else if (this.threeDimension == 2) {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("Cuboid Height :");
                in3 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println(new RectangleCuboid(in2, in1, in3).countCircum());
                break;
            } else {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("Cuboid Height :");
                in3 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println(new RectangleCuboid(in2, in1, in3).countVolume());
                break;
            }

        case 6:

            if (this.threeDimension == 1) {
                System.out.println("Input Radius:");
                in1 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Area : ");
                System.out.println(new CircleSphere(in1).countArea());
                break;

            } else if (this.threeDimension == 2) {
                System.out.println("Input Radius:");
                in1 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Circumference : ");
                System.out.println(new CircleSphere(in1).countCircum());
                break;
            } else {
                System.out.println("Input Radius:");
                in1 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Volume : ");
                System.out.println(new CircleSphere(in1).countVolume());
                break;
            }

        }
        System.out.println("Count Again ?");
        System.out.println("1. back to operation choice");
        System.out.println("2. back to 2D and 3D choice");
        this.confirmationState = input1.nextInt();
        if (this.confirmationState == 1) {
            GeometryThreeDimension();
        }
        if (this.confirmationState == 2) {
            showGeometryChoice();
        }

    }

    public void GeometryTwoDimension() {
        System.out.println("Count Operation :");
        System.out.println("1. Area");
        System.out.println("2. Circumference");
        System.out.println("---------------------------------");
        this.twoDimension = input1.nextInt();
        switch (geometryChoice) {
        case 1:
            if (this.twoDimension == 1) {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Area : ");
                System.out.println(new Triangle(in1, in2).countArea());
                break;

            } else {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Base :");
                in2 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Circumference : ");
                System.out.println(new Triangle(in1, in2).countCircum());
                break;
            }

        case 2:
            if (this.twoDimension == 1) {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Width :");
                in2 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Area : ");
                System.out.println(new Rectangle(in1, in2).countArea());
                break;

            } else {
                System.out.println("Input Height :");
                in1 = input1.nextFloat();
                System.out.println("Input Width :");
                in2 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Circumference : ");
                System.out.println(new Rectangle(in1, in2).countCircum());
                break;
            }

        case 3:
            if (this.twoDimension == 1) {
                System.out.println("Input Radius :");
                in1 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Area : ");
                System.out.println(new Circle(in1).countArea());
                break;

            } else {
                System.out.println("Input Radius :");
                in1 = input1.nextFloat();
                System.out.println("---------------------------------");
                System.out.println("The Circumference : ");
                System.out.println(new Circle(in1).countCircum());
                break;
            }
        }
        System.out.println("Count Again ?");
        System.out.println("1. back to operation choice");
        System.out.println("2. back to 2D and 3D choice");
        this.confirmationState = input1.nextInt();
        if (this.confirmationState == 1) {
            GeometryTwoDimension();
        }
        if (this.confirmationState == 2) {
            showGeometryChoice();
        }
    }

    public void showGeometryChoice() {
        do {
            isExit = true;
            System.out.println("Choose Geometry");
            System.out.println("<<<<<<<<<<< 2 D >>>>>>>>>>>");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("<<<<<<<<<<< 3 D >>>>>>>>>>>");
            System.out.println("4. Prism");
            System.out.println("5. Cuboid");
            System.out.println("6. Sphere");
            System.out.println("---------------------------------");
            System.out.println("7 . E X I T");
            geometryChoice = input1.nextInt();

            switch (geometryChoice) {
            case 1:
                System.out.println("Triangle");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
                GeometryTwoDimension();
                break;

            case 2:
                System.out.println("Rectangle");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
                GeometryTwoDimension();
                break;

            case 3:
                System.out.println("Circle");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
                GeometryTwoDimension();
                break;

            case 4:
                System.out.println("Prism");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
                GeometryThreeDimension();
                break;

            case 5:
                System.out.println("Cuboid");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
                GeometryThreeDimension();
                break;

            case 6:
                System.out.println("Sphere");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
                GeometryThreeDimension();
                break;

            case 7:
                this.isExit = false;
                break;

            }
            ;

            input1.close();

        } while (isExit);

    }

    public static void main(String[] args) {
        new Application().showGeometryChoice();

    }

}
