package Course;

import java.util.Scanner;

public class Application {
    Scanner input = new Scanner(System.in);
    String userName;
    int userAge;
    String userAddress;
    Integer userAnswer;
    String userCourse;
    Integer userSks;
    String userCourseRoom;
    String userCourseTaken = "Taken Course: ";
    Integer totalSks = 0;
    Student user = new Student("", 0, "");

    public void handleUserBiodata() {
        System.out.println();
        System.out.println("Please Enter Your Personal Information");
        System.out.print("Full Name: ");
        userName = input.nextLine();
        System.out.print("Address: ");
        userAddress = input.nextLine();
        System.out.print("Age: ");
        userAge = input.nextInt();

        // Set user name, age, address
        user.setName(userName);
        user.setAge(userAge);
        user.setAddress(userAddress);
        // print input
        user.showBiodata();

    }

    public void handleUserRegistration() {
        handleUserBiodata();
        System.out.println("Apply to college?");
        System.out.println("[ 1 ]  for Yes");
        System.out.println("[ 2 ] for No");
        System.out.print("Input: ");
        userAnswer = input.nextInt();
        System.out.println();
        if (userAnswer == 1) {
            user.handleStudentRegistration();
            handleCourse();

        }
        System.out.println("Goodbye, Thank you for using Java College Application!");
    }

    public void handleCourse() {
        do {
            System.out.println("Input Your Course ?");
            System.out.println("[ 1 ]  for Yes");
            System.out.println("[ 2 ] for No");
            System.out.print("Input: ");
            userAnswer = input.nextInt();
            if (userAnswer == 1 & totalSks < 144) {
                System.out.print("Course Name : ");
                userCourse = input.next();
                System.out.print("Course Room : ");
                userCourseRoom = input.next();
                System.out.print("Course Weight : ");
                userSks = input.nextInt();
                totalSks += userSks;
                System.out.println();
                System.out.println("--------------------------------------");
                user.countCourseForGraduate(userSks);
                System.out.println();
                System.out.println("Total SKS : " + totalSks);
                userCourseTaken = userCourseTaken + user.inputCourseData(userCourse, userCourseRoom) + " | ";
                System.out.println(userCourseTaken);
                System.out.println();

                ;
            }
            if (userAnswer == 2) {
                System.out.println("Close Menu for Inputting Course");

            }
        } while (totalSks < 144);
        System.out.println("Congratulation on your graduation!");
        System.out.println(user.getName() + " S.T");

    }

    public static void main(String[] args) {
        Application runProgram = new Application();
        runProgram.handleUserRegistration();
    }
}
