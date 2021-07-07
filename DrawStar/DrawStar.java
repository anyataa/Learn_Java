package DrawStar;

public class DrawStar {
    public int start = 9;

    public static void main(String[] args) {

        // 1
        for (int i = 0; i >= 9; i++) {
            for (int j = 0; j > 9; j++) {
                if ((j + i) >= 9) {
                    System.out.print(" +");
                }
                if (j > i) {
                    System.out.print("O");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        // 2
        // for (int i = 1; i <= 9; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

    }

}
