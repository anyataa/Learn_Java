package Course2;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // Set and get for age

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Setter Getter for address dynamically
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Setter Getter for Name to access it in student class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
