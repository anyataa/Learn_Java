package TaskJava;

import java.util.Scanner;

public class MainApp {
    Scanner userInput = new Scanner(System.in); // Create a Scanner object
    int userChoice;
    String otherChoice;
    boolean isRun;

    public void handleInput() {
        System.out.println("What do you want to know?");
        System.out.println("1 = for education");
        System.out.println("2 = for background");
        System.out.println("3 = exit");
        System.out.println("Your choice: ");
        this.userChoice = userInput.nextInt(); // Read user input
    }

    public void showOutput() {
        Person anya = new Person("Anya", "Tamara", 1999);
        anya.setAddress("Beverly Dago 1201, Bandung");
        anya.setEducation("S1 Pendidikan Teknik Mesin - UNJ");
        System.out.println("anya");
        do {
            handleInput();
            this.isRun = true;
            switch (this.userChoice) {
            case 1:
                anya.introducePerson();
                System.out.println();
                break;
            case 2:
                System.out.println(anya.getEducation());
                System.out.println();
                break;
            case 3:
                isRun = false;
                break;
            }
            System.out.println("Exit program? [ y / n ]");
            otherChoice = userInput.next();
            if (otherChoice.equals("y")) {
                System.out.println();
            } else {
                System.out.println("Thank you, see you in the next program!");
                isRun = false;
            }

        } while (isRun);

    }

    public static void main(String[] args) {
        MainApp application = new MainApp();
        application.showOutput();
        // Action based on user input
        // == reference
        // Menu jika klik 1 person details, jika menu 2
        // munculin lagi menu
        // Scanner diclose

    }
}
