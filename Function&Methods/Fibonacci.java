public class Fibonacci {
    public static void main(String[] args) {
        
        int num = 10;

        int first = 0;
        int second = 1;
        for (int i = 0; i < num; i++){

            while (first < num) {
                System.out.println(first);
                int nextItem = first + second;
                first = second;
                second = nextItem;

            }
        }
    }
}
