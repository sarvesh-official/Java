package AdvancedPattern;

public class Butterfly {
    public static void Print(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            int spaces = (rows - i) * 2;
            for (int k = 1; k <= spaces; k++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        // * */ Mirror Image
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            int spaces = (rows - i) * 2;
            for (int k = 1; k <= spaces; k++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Print(4);
    }
}
