package Assignment;

public class crossDraw {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                // Go to the right
                if (j == i) {
                    System.out.print("*");
                }
                // Go to the left
                if (10 - j == i) {
                    if (10 - j == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }
                // fill the blank with nothing
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
