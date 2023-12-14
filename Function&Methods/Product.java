import java.util.Scanner;

public class Product {

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        int product = product(a, b);
        System.out.println("The product is : " + product);

    }
}