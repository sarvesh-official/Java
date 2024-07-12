package DivideAndConquer;

public class Main {

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void mergeSortCode(int arr[], int si, int ei) {

        // Base Case
        if (si >= ei) {
            return;
        }
        int mid = (si+ei)/2;
        // Left
        mergeSortCode(arr, si, mid);
        // Right
        mergeSortCode(arr, mid + 1, ei);
        // Merge
        merge(arr, si, mid, ei);
        
    }
    
    public static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
    
    public static int searchRotatedSortedArray(int[] arr, int target, int si, int ei) {
        
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;

        // Case Found
        if (arr[mid] == target) {
            return mid;
        }

        // mid in L1
        if (arr[si] <= arr[mid]) {

            // case a:
            if (arr[si] <= target && target <= arr[mid]) {
                return searchRotatedSortedArray(arr, target, si, mid - 1);
            }

            // case b:
            else {
                return searchRotatedSortedArray(arr, target, mid + 1, ei);
            }
        }
        
        // mid in L2
        else {
            
            // case a:
            if (arr[mid] <= target && target <= arr[ei]) {
               return searchRotatedSortedArray(arr, target, mid + 1, ei);
            }
            else {
                return searchRotatedSortedArray(arr, target, si, mid - 1);
            }
        }

    }
   
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6 , 7 , 0 , 1 , 2 };
        int target = 0;
        // mergeSortCode(arr, 0, arr.length - 1);
        // printArr(arr);

        System.out.println(searchRotatedSortedArray(arr, target, 0 , arr.length - 1));




    }
}

