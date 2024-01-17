package Arrays;

// * O(n) Kadanes Algorithm

public class MaxSubArraySum {
    public static void Kadanes(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        // * */ Loop 1
        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            max = Math.max(max, currentSum);
        }
        System.out.println("Maximum Sum: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        Kadanes(numbers);
    }

}

// ^ O(n^2)

// public class MaxSubArraySum {

// public static void FindMax(int[] numbers) {

// int max = Integer.MIN_VALUE;
// int sum = 0;
// int[] prefix = new int[numbers.length];

// prefix[0] = numbers[0];

// for (int i = 1; i < numbers.length; i++) {
// prefix[i] = prefix[i - 1] + numbers[i];
// }

// for (int i = 0; i < numbers.length; i++) {

// for (int j = i; j < numbers.length; j++) {
// // ! prefix[end] - prefix[start - 1]
// sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
// }
// if (sum > max) {
// max = sum;
// }
// }
// System.out.println(max);

// }

// public static void main(String[] args) {
// int[] numbers = { 2, 4, 6, 8, 10 };

// FindMax(numbers);
// }
// }

// ! O(n^3)
// public class MaxSubArraySum {

// public static void findMax(int[] numbers) {

// int max = Integer.MIN_VALUE;
// int sum = 0;
// // * Loop 1
// for (int i = 0; i < numbers.length; i++) {
// // & Loop 2
// for (int j = i; j < numbers.length; j++) {
// // ^ Loop 3
// for (int k = i; k <= j; k++) {
// sum += numbers[k];
// }
// System.out.println(sum);
// if (sum > max) {
// max = sum;
// }
// sum = 0;
// }
// }
// System.out.println("The maximum sum is : " + max);
// }

// public static void main(String[] args) {

// int[] numbers = { 2, 4, 6, 8, 10 };
// findMax(numbers);
// }
// }
