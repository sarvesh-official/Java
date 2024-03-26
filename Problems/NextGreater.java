package Problems;


import java.util.*;

public class NextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Create a map to store the next greater element for each value in nums2

        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through nums2 to find the next greater element for each value
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // Initialize the result array with -1 for all values in nums1
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        
        // Populate the result array with the next greater element
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];

            if (nextGreater.containsKey(num)) {
                result[i] = nextGreater.get(num);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        NextGreater solution = new NextGreater();
        int[] nums1 = {4,4,1,5};
        int[] nums2 = {1,2,5,4};
        int[] output = solution.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(output)); // Output: [3, -1]
    }
}