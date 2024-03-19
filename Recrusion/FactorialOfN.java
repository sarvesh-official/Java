package Recrusion;

public class FactorialOfN {

    public static int findFib(int n) {
        
        if (n == 0) {
            return 1;
        }

        return n * findFib(n - 1);
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFib(n));
    
    }
}
