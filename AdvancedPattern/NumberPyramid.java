package AdvancedPattern;

public class NumberPyramid {

    public static void Print(int rows) {

        // ? Outer Loop
        for (int i = 1; i <= rows; i++) {
            // * Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // * Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Print(5);
    }
}
