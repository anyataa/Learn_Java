package JavaCollection;

public class Application {
    public <arrayElement> void printArray(arrayElement[] arrayElement) {
        for (arrayElement eachElement : arrayElement) {
            System.out.println(eachElement);
        }
    }

    public static void main(String[] args) {
        Application app = new Application();

    }
}
