package Recrusion;

public class ArrayIsSorted {

    public static boolean isSorted(int[] array, int n) {
        
        if (array.length - 1 == n) {
            return true;
        }
        if (array[n] > array[n + 1]) {
            return false;
        }
        
        return isSorted(array, n + 1);
    }

    public static void main(String[] args) {
        
        int[] arr = { 2, 3, 4, 5, 6, 7 };
        
        System.out.println(isSorted(arr,0));
    }
}
