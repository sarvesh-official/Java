
package AdvancedPattern;

/**
 * Hollow
 */
public class Hollow {

    public static void printHallow(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {

            for (int j = 1; j <= totalCols; j++) {

                if (i == 1 || j == 1 || i == totalRows || j == totalCols) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // System.out.println("*");
        printHallow(4, 5);
    }
}