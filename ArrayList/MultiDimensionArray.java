package ArrayList;

import java.util.*;

public class MultiDimensionArray {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        //2D List

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        array.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        array.add(list2);


        for (int i = 0; i < array.size(); i++) {
            
            for (int j = 0; j < array.get(i).size(); j++) {
                System.out.println(array.get(i).get(j));
            }
        }
    }
}
