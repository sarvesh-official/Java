import java.util.*;

public class PrimeorNot {

    public static boolean isPrime(int n) {

        boolean isPrime = true;
        if (n == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }

            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("Yes it is Prime");
        } else {
            System.out.println("No it is not a prime no");
        }
    }
}
