package Inheritance;

public class Human {
    private String name;
    private String address;
    private int age;

    public Human(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // bisa ada 2 jenis dari class ini constructor
    public Human() {

    }

    public void introduceHuman() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
