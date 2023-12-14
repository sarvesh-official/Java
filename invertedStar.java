import java.util.Scanner;

public class invertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to print");
        int lines = sc.nextInt();

        for (int i = 1; i <= lines; i++) {

            // * */ To invert stars = lines - i + 1
            for (int stars = 1; stars <= (lines - i + 1); stars++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
