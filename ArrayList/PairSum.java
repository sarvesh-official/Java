package ArrayList;

import java.util.ArrayList;

public class PairSum {

    
    // * Two Pointer Method
    public static boolean PairSum1Optimized(ArrayList<Integer> list, int target) {
    int left = 0;
    int right = list.size() - 1;

    while (left < right) {
        if (list.get(left) + list.get(right) == target) {
            return true;
        }
        if (list.get(left) + list.get(right) < target) {
            left++;
        } else {
            right--;
        }
    }
    return false;
}


    // ! Bruteforce Approach
    public static boolean PairSum1(ArrayList<Integer> list, int target) {
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);

        int target = 5;

        System.out.println(PairSum1Optimized(list,target));
    }
     
}
