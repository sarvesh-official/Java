package DojoProblems;

public class SumLessThanTarget {

    public static void findThePairs(int target, int[] arr) {
        
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                if (i + j < target) {
                    count += 1;
                }
            }
        }
        
        System.out.println(count);
    }
    public static void main(String[] args) {
        int target = 2;
        int arr[] = {-1,1,2,3,1};
        findThePairs(target, arr);
    }
}
