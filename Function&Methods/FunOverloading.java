public class FunOverloading {
    // Function to add 2 num
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function to add 2 float
    public static float sum(float a, float b) {
        return a + b;
    }

    // Function to add 3 num
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 9));
        System.out.println(sum(1f, 9f));
        System.out.println(sum(10, 9, 4));
    }

}
