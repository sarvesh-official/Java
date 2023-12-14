import java.util.Scanner;

public class BinomialCoeff {
    public static int factorial(int num) {
        int f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    // * Binomial Coeff = n!/ r! x (n-r)!

    public static int bc(int n, int r) {

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);

        int binomial_coff = n_fact / (r_fact * n_r_fact);

        return binomial_coff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.err.print("Enter the value of r: ");
        int r = sc.nextInt();

        System.err.println("The Binomial Coefficient is " + bc(n, r));
    }

}
