package Arrays;

import java.util.Arrays;;

public class ArraywithFunction {

    // & Pass by value -- The value is not changed in main function
    // & Reference -- The value in the main function is changed --- Arrays
    public static void Update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5 };
        Update(marks);
        System.out.println(Arrays.toString(marks));
    }
}
