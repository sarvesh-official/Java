package DojoProblems;

public class Challenge1 {
    
    public static int[] Reform(int[] array,int n, int len) {

        int[] array2 = new int[array.length];

        for(int i = 0; i < n;i++){

            array2[i * 2] = array[i];
            array2[i * 2 + 1] = array[n + i];
        }
        return array2;
    }
    public static void main(String[] args) {
        
        int len = 6;
        int[] arr = {2,5,1,3,4,7};
        int n = 3;

        arr = Reform(arr, n,len);

        for(int i = 0 ; i < len ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
