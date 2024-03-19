package BackTacking;

public class ChangeArray {

    public static void printArr(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void chaneArr(int[] arr, int idx, int val) {
        
        //! Base Case
        if (idx == arr.length) {
            printArr(arr);
            return;
        }

        // * Recursion
        arr[idx] = val;
        chaneArr(arr, idx + 1, val + 1);
        arr[idx] = arr[idx] - 2;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];

        chaneArr(arr, 0, 1);
        printArr(arr);
    }
}
