package AdvancedPattern;

public class HalloRhombus {

    public static void Print(int rows) {

        // ? Outer Loop
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++) {

                if (i == 1 || k == 1 || i == rows || k == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Print(5);
    }
}
