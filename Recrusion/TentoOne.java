package Recrusion;

public class TentoOne {

    public static void printDec(int n) {
        
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {

        if (n == 0) {
            return;
        }
        printInc(n - 1);
        System.out.println(n);

    }

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }
    
    public static int sumOfn(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sumOfn(n - 1);

    }
    
    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static boolean sortedArray(int[] arr, int i) {

        if (arr.length - 1 == i) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return sortedArray(arr, i + 1);

    }
    
    public static int firstOccurrence(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }
    

    public static int lastOccurrence(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurrence(arr, key, i + 1);

        // if (isFound != -1) {
        //     return isFound;
        // }

        // if (arr[i] == key) {
        //     return i;
        // }
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }
    
    public static int power(int x, int n) {
        
        if (n == 0) {
            return 1;
        }

        int fnm1 = power(x, n - 1);

        return x * fnm1;
    }
    

    public static int optimisedPower(int a, int n) {

        if (n == 0) {
            return 1;
        }

        int halfPower = optimisedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    
    public static int tilingProblem(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical Choice
        int fnm1 = tilingProblem(n - 1);

        // Horizontal Choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            removeDuplicates(str, idx + 1 , newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
        int[] arr = { 3,2,3,4,5 };
        System.err.println((fibonacci(5)));
        System.err.println((sortedArray(arr,0)));
        System.err.println((firstOccurrence(arr,3,0)));
        System.err.println((lastOccurrence(arr,3,0)));
        System.err.println((optimisedPower(2,10)));
        System.err.println((tilingProblem(2)));
        removeDuplicates("appnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}


