package PPP;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix[0].length;
       int col = matrix.length;

       int top = 0;
       int left = 0;

       int bottom = col - 1;
       int right = row - 1;

        List<Integer> list = new ArrayList<Integer>();

       while(top <= bottom && left <= right){

        // Top --> Left to Right
        for(int i = left ; i <= right; i++){
            list.add(matrix[top][i]);
        }

        // Right --> Top to Bottom
        for(int i = top + 1 ; i <= bottom ; i++ ){
            list.add(matrix[i][right]);
        }

        // Bottom --> Right to Left
        for(int i = right - 1  ; i >= left ; i--){
            if(top == bottom){
                break;
            }
            list.add(matrix[bottom][i]);
        }

        // Left --> Bottom to Top
        for(int i = bottom - 1 ; i >= top + 1; i--){
            if(left == right){
                break;
            }
            list.add(matrix[i][left]);
        }

        top++;
        left++;

        bottom--;
        right--;


       }

    return list;
}   
        public static void main(String[] args) {
         int matrix[][] = {
                 { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 },
                 { 9, 10, 11, 12 }

         };
         List<Integer> result = spiralOrder(matrix);
        
         System.out.println(result);
    }   
}
