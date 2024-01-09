package AdvancedPattern;

public class Diamond {
    public static void Print(int rows) {
        for (int i = 1; i <= rows; i++) {
            // * */ spaces
            for (int j = 1; j <= rows - i; j++) {

                System.out.print(" ");
            }
            // * Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            // * Spaces */
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // * Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Print(4);
    }

}
