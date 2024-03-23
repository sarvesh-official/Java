package DojoProblems;

import java.util.*;
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextGreaterMap.put(nums2[i], stack.peek());
            } else {
                nextGreaterMap.put(nums2[i], -1);
            }
            stack.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 1, 2};
        int[] nums2 = {4, 1, 3, 4, 2};
        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));

        int[] nums3 = {2, 2, 4, 4};
        int[] nums4 = {1, 2, 3, 4};
        int[] result2 = nextGreaterElement(nums3, nums4);
        System.out.println(Arrays.toString(result2));
    }
}