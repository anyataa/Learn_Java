package Assignment;

public class hourGlassDraw {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 2) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 10 - i + 1; j++) {
                System.out.print("* ");
                // System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 10; i >= 1; i = i - 2) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 10; j++) {
                System.out.print("* ");
                // System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
