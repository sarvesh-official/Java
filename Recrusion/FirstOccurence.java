package Recrusion;

public class FirstOccurence {

    public static int findFirstOccurence(int arr[], int key, int i) {
        
        if (arr.length == i) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        
        return findFirstOccurence(arr, key, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 8, 4, 5, 3 };
        System.out.println(findFirstOccurence(arr,5,0));
    }
}
