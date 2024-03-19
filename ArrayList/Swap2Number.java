package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2Number {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        
        int temp = list.get(idx1);

        list.set(idx1, list.get(idx2));

        list.set(idx2, temp);

        System.out.println(list);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(100);

        int idx1 = 0;
        int idx2 = 1;

        System.out.println(list);
        swap(list, idx1, idx2);
        
        Collections.swap(list, 3, 4);
        System.out.println(list);
    }
}
