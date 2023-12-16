import java.util.Scanner;

public class DecToBin {

    public static void decToBin(int n) {
        int pow = 0;
        int myNum = n;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (int) (rem * Math.pow(10, pow));

            pow++;
            n = n / 2;
        }
        System.out.println("The binary value of " + myNum + "= " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        decToBin(num);
    }
}
