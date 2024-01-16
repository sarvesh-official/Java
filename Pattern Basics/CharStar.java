import java.util.Scanner;

public class CharStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.println("Enter the no of lines: ");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }

    }
}
