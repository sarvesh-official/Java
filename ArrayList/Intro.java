package ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        

        list.add(10);

        // Add will place the element in the particular place and change the index of other elements to next place

        list.add(0, 10);
        
        // Set will replace the element
        list.set(1, 11);
        

        //  Get method returns null if index is out of bound
        int a = list.get(0);
        
        // Remove method removes the element with the given index
        list.remove(0);


        // Size of a ArrayList

        list.add(3);
        list.add(10);
        list.add(45);
        list.add(23);
        list.add(98);
        list.add(55);
        list.add(43);

        System.out.println(list.size());
        System.out.println(list);
        
        System.out.println(list.contains(11));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
