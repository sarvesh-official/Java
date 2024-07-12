/**
 * Practice
 */
public class Practice {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getOccurence(int[] arr, int n, int oc) {

        int len = arr.length;
        int count = 0;

        for (int i = 0; i < len; i++) {

            if (arr[i] == n) {
                count++;
            }

            if (count == oc) {
                return i;

            }

        }

        return -1;

    }
    
    public static void isFound(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Missing");
        return;
    }
    
    public static void secondLargest(int[] arr) {
        
        int count = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i ; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println(arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 3, 6, 7, 6, 3, 10 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 23, 45, 7, 34, 25, 25, 89 };
        System.out.println(getOccurence(arr, 3, 2));
        isFound(arr2, 2);
        secondLargest(arr3);
    }

  
}