import java.util.*;

public class BitwiseXOR {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println(a ^ b);
        sc.close();
    }
}

