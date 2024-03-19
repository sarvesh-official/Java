package ArrayList;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(13);
        list.add(35);
        list.add(03);
        list.add(31);
        list.add(34);
        list.add(33);
        list.add(32);
        list.add(30);

        // & Ascending Order
        Collections.sort(list);

        System.out.println(list);
        
        // ^ Descending Order
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        
    }
}
