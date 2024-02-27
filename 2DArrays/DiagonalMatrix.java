public class DiagonalMatrix {

    public static void findTheDiagonalSum(int[][] matrix){

        int len = matrix.length;


        int sum = 0;
        //* Method one */
        // for(int i = 0; i <  len ;i++ ){

        //     for(int j = 0 ; j < matrix[0].length; j++){

        //         if (i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if((i + j) == (len - 1)){
        //             sum += matrix[i][j];
        //         }

        //     }
        // }
        // & Method two
        for(int i = 0 ; i < len ; i++){
            sum+= matrix[i][i];

            // * i + j = len - 1 ==> (j = len - 1 - i)
            if(i != len-1-i){

                sum+= matrix[i][len - 1 - i];
            }
        }
        System.err.println(sum);
    }
    public static void main(String[] args) {
            int matrix[] [] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
            }   ;
            
            findTheDiagonalSum(matrix);
    }   
}
