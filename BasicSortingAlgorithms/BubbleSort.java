package BasicSortingAlgorithms;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
  
    public static void OptimisedBubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        
        /*
        0th
         5 4 1 3 2
        
         4 5 1 3 2
         4 1 5 3 2
         4 1 3 5 2
         4 1 3 2 5
         
         1th
         4 1 3 2 5
         
         1 4 3 2 5
         1 3 4 2 5
         1 3 2 4 5
         
         2nd
         1 3 2 4 5
        
         1 3 2 4 5
         1 2 3 4 5
         
         3rd
         1 2 3 4 5
        
         1 2 3 4 5
        
        */

        bubbleSort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        OptimisedBubbleSort(arr);
        System.out.println("\nThe optimized sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    

    
}
