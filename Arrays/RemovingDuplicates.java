import java.util.*;

public class RemovingDuplicates {

    public static int Remove(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);

        int initial = 0;
        for (int i = 1; i < len; i++) {

            if (arr[i] != arr[initial]) {
                arr[initial + 1] = arr[i];
                initial++;
            }
        }
        return initial + 1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 10, 10, 17, 2, 3, 11, 3, 4 };


        int index = Remove(arr);

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}
