import java.util.Scanner;

public class FunwithPara {

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The total is : " + sum);
        sc.close();
    }
}
