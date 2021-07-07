package Assignment;

public class Star1 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 8; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
