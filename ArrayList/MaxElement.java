package ArrayList;

import java.util.*;

public class MaxElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(87);
        list.add(76);
        list.add(66);
        list.add(53);
        list.add(29);
        list.add(32);
        list.add(42);
        list.add(20);
        list.add(10);

        int max = Integer.MIN_VALUE;

        for (int i : list) {
            max = Math.max(i, max);
        }
        // for (int i = 0; i < list.size(); i++) {

        // }
        System.out.println(max);
        System.out.println(Collections.max(list));
    }
}