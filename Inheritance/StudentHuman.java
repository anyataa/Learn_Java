package Inheritance;

public class StudentHuman extends Human {
    private String major;

    public StudentHuman(String name, String address, int age, String major) {
        super(name, address, age);
        this.major = major;
    }

    public void printMajor() {
        System.out.println("Major :" + major);
    }

    @Override
    public void introduceHuman() {
        // TODO Auto-generated method stub
        super.introduceHuman();
    }

}
