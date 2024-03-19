
public class Reverse {

    public static void ReverseArray(int[] numbers) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            // int temp = numbers[end];
            // numbers[end] = numbers[start];
            // numbers[start] = temp;

            int tem = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = tem;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        ReverseArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
