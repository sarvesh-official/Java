package Recrusion;

public class LastOccurence {

    public static int findLastOccurence(int[] arr, int key, int i) {
        
        if (i == arr.length) {
            return -1;
        }

        int next = findLastOccurence(arr, key, i + 1);

        if (next == -1 && arr[i] == key) {
            return i;
        }
        
        return next;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 8, 4, 5, 3 };
        System.out.println(findLastOccurence(arr, 5, 0));
    }

}
