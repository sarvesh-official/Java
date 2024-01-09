package AdvancedPattern;

public class PalindromicPattern {

    public static void Print(int rows) {
        // ? Outer Loop
        for (int i = 1; i <= rows; ++i) {

            // * Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // ? Descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ? Ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // & Exit
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Print(5);
    }
}
