package Course;

import java.util.Random;

public class Student extends Person implements College {

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    // Inputting data based on person name
    public void handleStudentRegistration() {
        Random randomGenerator = new Random();
        Integer randomNum = randomGenerator.nextInt(1000);
        registStudent(super.getName(), randomNum);

    }

    public void showBiodata() {
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Your Biodata: ");
        System.out.println("Name : " + super.getName());
        System.out.println("Age : " + super.getAge());
        System.out.println("Address : " + super.getAddress());
        System.out.println("-------------------------------");
        System.out.println();
    }

    @Override
    public void registStudent(String fullName, Integer cardNumber) {

        System.out.println("Congratulation! Welcome to College, " + fullName
                + " Your Card Number Identification for College is " + cardNumber);
        System.out.println();
        System.out.println("Student's Detail");
        System.out.println("-------------------------------");
        System.out.println("Name : " + fullName);
        System.out.println("Card Number Identication : " + cardNumber);
        System.out.println();

    }

    // @Override
    // public void learningPlan(String courseName, Integer sks, String room) {

    // if (sks >= 144) {
    // System.out.println("Congratulation on your graduation!");
    // System.out.println(super.getName() + " S.T");
    // }

    // }

    @Override
    public void countCourseForGraduate(Integer sks) {
        // TODO Auto-generated method stub
        if (sks >= 144) {
            System.out.println("Congratulation on your graduation!");
            System.out.println(super.getName() + " S.T");
        }

    }

    @Override
    public String inputCourseData(String courseName, String room) {
        // TODO Auto-generated method stub
        System.out.println("Inputted Course: " + courseName);
        return courseName;

    }

}
