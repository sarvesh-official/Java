package AdvancedPattern;

/**
 * InvertedHalfPyramid
 */
public class InvertedHalfPyramid {
    public static void Print(int row) {
        for (int i = 1; i < row; i++) {
            // ? */ To print spaces
            int spaces = row - i;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // * */ Printing Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Print(5);
    }
}
