package Arrays;

public class Subarray {

    public static void Print(int[] nums) {
        int ts = 0;
        int sum = 0;
        // ? L1
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                for (int k = start; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                ts++;
                System.out.println();
                // System.out.println("Total Sum = " + sum);
                sum = 0;
            }
            System.out.println();
        }
        // System.out.println("Total Subarrays: " + ts);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        Print(nums);
    }
}
