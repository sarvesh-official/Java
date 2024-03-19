package Stacks;

import java.util.Stack;

public class MaximumAreaInHistogram {

    public static void maxArea(int[] arr) {

        int n = arr.length;
        int maxArea = 0;

        //^  Initializing Next Smaller Right and Next Smaller Left
        int[] nsr = new int[n];
        int[] nsl = new int[n];

        //^ Declaring  Stack

        Stack<Integer> s = new Stack<>();

        //& Calculating  Next Smaller Right

        for (int i = n - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        //& Calculating  Next Smaller Left

        for (int i = 0; i < n; i++) {
            
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        // ! Curr Area = nsr[i] - nsl[i] - 1
        for (int i = 0; i < arr.length; i++) {

            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;

            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);
        }
        
        System.err.println("Max Area = " + maxArea);

    }
    public static void main(String[] args) {
        
        int[] arr = { 9,0 }; //Heights in Histogram
        
        maxArea(arr);
    }
}
