package Recrusion;

public class TilingProblem {

    public static int FindNoOfWays(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical choice
        int fnm1 = FindNoOfWays(n - 1);

        // Horizontal choice
        int fnm2 = FindNoOfWays(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(FindNoOfWays(2));
    }
}