package TaskJava;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Person anya = new Person("Anya", "Tamara", 1999);
        anya.setAddress("Beverly Dago 1201, Bandung");
        anya.setEducation("S1 Pendidikan Teknik Mesin - UNJ");
        anya.introducePerson();
        System.out.println("More Info [ y / n ] ?");
        Scanner userInput = new Scanner(System.in); // Create a Scanner object
        String userChoice = userInput.next(); // Read user input
        System.out.println("Your Choice: " + userChoice); // Output user input
        // Action based on user input
        if (userChoice.equals("y")) {
            System.out.println("<<<<<<<<< Here's the education background details: >>>>>>>>");
            System.out.println(anya.getEducation());
        } else {
            System.out.println("Okay, See you in the next Java Application");
        }
    }
}
