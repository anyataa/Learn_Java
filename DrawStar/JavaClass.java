package DrawStar;

import java.util.Date;

import javax.print.attribute.standard.PrinterInfo;

public class JavaClass {
    public static void main(String[] args) {
        System.out.println("panjang ya print doang");
        String Name = "Anya";
        System.out.println(Name.toUpperCase());
        System.out.print(Name);
        // Primitive types to store a single value
        byte myWeight = 45;
        long mySubscriber = 1_213_323_434_327L;
        float cents = 1.99F;
        System.out.println(myWeight + mySubscriber);
        // Reference type to store complex object
        // For Reference type we need to alocate memory
        // manually for ourself so we use "new"
        Date now = new Date();
        System.out.println(now);
        System.out.println("anya");

    }
}