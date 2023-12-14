import java.util.*;

public class HalfPramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines to print: ");
        int lines = sc.nextInt();

        for (int line = 1; line <= lines; line++) {

            for (int numbers = 1; numbers <= line; numbers++) {
                System.out.print(numbers);
            }
            System.out.println("");
        }

    }
}
