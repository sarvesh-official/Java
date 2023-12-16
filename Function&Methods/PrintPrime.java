import java.util.Scanner;

public class PrintPrime {

    public static boolean Print(int num) {

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                isPrime = false;
                break;

            }

        }
        return isPrime;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter upto which number you need: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            if (Print(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
