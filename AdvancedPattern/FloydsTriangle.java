package AdvancedPattern;

public class FloydsTriangle {

    public static void Print(int rows) {
        int counter = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Print(5);
    }
}
