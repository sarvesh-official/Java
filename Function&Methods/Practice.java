import java.util.Scanner;

public class Practice {

    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
            int reminder = palindrome % 10;
            reverse = reverse * 10 + reminder;

            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void bintodec(int n) {
        // 101 --> 5
        int myNum = n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        System.out.println("The Decimal value of " + myNum + "= " + dec);
    }

    public static void dectobin(int n) {

        int pow = 0;
        int myNum = n;
        int bin = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) (Math.pow(10, pow)));

            pow++;
            n = n / 2;

        }
        System.out.println("The Decimal value of " + myNum + "= " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the Decimal Number: ");
        // int num1 = sc.nextInt();
        // dectobin(num1);

        System.out.println("Enter the Binary Number: ");
        int num = sc.nextInt();
        bintodec(num);
    }

}
