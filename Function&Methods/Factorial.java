import java.util.Scanner;

public class Factorial {

    // ? Factorial Formula n! = (n-1) x (n-2) x (n-3) .... 1
    public static Double factorial(Double num) {
        Double f = (double) 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double num = sc.nextDouble();
        System.out.println(factorial(num));
    }
}
