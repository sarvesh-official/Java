

public class LargestNumber {

    public static int[] Largest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        int[] answer = { min, max };
        return answer;

    }

    public static void main(String[] args) {
        int numbers[] = { 20, 5, 3, 130, 2, 200, 42, 503, 25, 456 };
        int[] result = Largest(numbers);
        System.out.println("The largest number is " + result[1]);
        System.out.println("The smallest number is " + result[0]);
    }
}
