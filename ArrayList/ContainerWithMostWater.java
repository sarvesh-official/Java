package ArrayList;

import java.util.*;


public class ContainerWithMostWater {

    // ! 2 Pointer Approach
    public static int maxArea(ArrayList<Integer> height) {
        
        int left = 0;
        int right = height.size() - 1;

        int maxArea = 0;
        while (left < right) {
            
            int h = Math.min(height.get(left), height.get(right));

            int width = right - left;

            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height.get(left) < height.get(right)) {
                left++;
            }
            else {
                right--;
            }
            }
            return maxArea;
        }
    
    

    public static int storeWater(ArrayList<Integer> height) {
        

        int maxArea = 0;

         

        //* */ bruteForce method - O(N^2)
        for (int i = 0; i < height.size(); i++) {

            for (int j = i + 1; j < height.size(); j++) {

                int ht = Math.min(height.get(i), height.get(j));

                int width = j - i;
                int currArea = ht * width;

                maxArea = Math.max(maxArea, currArea);
            }
        }
        
        return maxArea;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(maxArea(list));
    }
}
