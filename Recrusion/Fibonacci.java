package Recrusion;

public class Fibonacci {

    public static int fibo(int n) {

        // if (n == 1) {
        //     return 1;
        // }
        // if (n == 0) {
        //     return 0;
        // }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        
        int n = 500;
    
        for(int i = 0 ; i <= n; i++){
            System.out.println(fibo(i));
        }
    }
}
