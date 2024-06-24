package Recrusion;

public class TentoOne {

    public static void printDec(int n) {
        
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {

        if (n == 0) {
            return;
        }
        printInc(n - 1);
        System.out.println(n);

    }

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }
    
    public static int sumOfn(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sumOfn(n - 1);

    }
    
    public static int fibonacci(int n) {
        
        if (n == 0 || n == 1) {
            return n; 
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);

        System.err.println((fibonacci(5)));
    }
}
