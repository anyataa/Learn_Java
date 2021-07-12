package Course2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
    Set<String> setTakenCourse = new HashSet<>();

    // 1
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

    // 2
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

    // 3
    public void handleCourse() {
        do {
            System.out.println("Input Your Course ?");
            System.out.println("[ 1 ]  for Yes");
            System.out.println("[ 2 ] for Exit");
            System.out.print("Input: ");
            userAnswer = input.nextInt();
            if (userAnswer == 1 & totalSks < 144) {
                System.out.println();
                System.out.println("Please Input your Course: ");
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
                System.out.println("Total Course Weight : " + totalSks);
                // userCourseTaken = userCourseTaken + " \n " + " - " +
                // user.inputCourseData(userCourse, userCourseRoom);
                System.out.println(userCourseTaken);
                System.out.println();
                System.out.println("--------------------------------------");
                System.out.println();
                setTakenCourse.add(user.inputCourseData(userCourse, userCourseRoom));
                System.out.println("List of Taken Course : ");
                for (String course : setTakenCourse) {
                    System.out.println(course);
                }
                System.out.println();
                ;

                ;
            }
            if (userAnswer == 2) {
                System.out.println("Close Menu for Inputting Course");
                break;
            }
        } while (totalSks < 144);
        if (totalSks >= 144) {
            System.out.println("Congratulation on your graduation!");
            System.out.println(user.getName() + " S.T");
        }

    }

    public static void main(String[] args) {
        new Application().handleUserRegistration();
    }
}
