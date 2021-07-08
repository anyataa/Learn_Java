package TaskJava;

import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int yearOfBirth;
    private String Education;
    Calendar calendarPack = Calendar.getInstance();
    private int currentYear = calendarPack.get(Calendar.YEAR);

    // Set constructor
    public Person(String firstN, String lastN, int i) {
        firstName = firstN;
        lastName = lastN;
        yearOfBirth = i;
    }

    public void introducePerson() {
        System.out.println("<<<<<<<<<<<<<<< Person Details >>>>>>>>>>>>>>> ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        // Count age
        System.out.println("Age: " + (currentYear - yearOfBirth));
        // System.out.println(currentYear);
    }

    // Address
    public void setAddress(String address) {
        this.address = address;
    }

    // Education
    public void setEducation(String education) {
        Education = education;
    }

    public String getEducation() {
        return Education;
    }

}
