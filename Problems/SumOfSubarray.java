package Problems;

public class SumOfSubarray {
    public static void main(String[] args) {
        int[] nums1 = {-3,4,1,2,8};
        int output1 = sumOfSubarrayRanges(nums1);
        System.out.println("Example 1 Output: " + output1);
    }

    public static int sumOfSubarrayRanges(int[] nums) {
        int totalSum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int maxVal = nums[i];
            int minVal = nums[i];
            for (int j = i + 1; j < n; j++) {
                maxVal = Math.max(maxVal, nums[j]);
                minVal = Math.min(minVal, nums[j]);
                totalSum += maxVal - minVal;
            }
        }

        return totalSum;
    }
}

