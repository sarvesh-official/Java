package Recrusion;

public class Power {
    
    public static int optimisedPower(int n, int x) {
        
        if (x == 0) {
            return 1;
        }

        int power = optimisedPower(n, x / 2) *  optimisedPower(n, x / 2);

        if (x % 2 != 0) {
            power = n * power;
        }

        return power;
    }
    public static int findPower(int n, int x) {
        
        if (x == 0) {
            return 1;
        }

        return n * findPower(n, x - 1);

    }
    public static void main(String[] args) {

        System.out.println(optimisedPower(2,10));
    }   
}
