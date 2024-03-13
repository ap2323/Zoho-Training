public class MatrixMultiplication
{
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {5, 6, 8}
        };

        int[][] matrix2 = {
                {3, 4},
                {6, 7},
                {2, 8}
        };

        int rowa = matrix1.length;
        int cola = matrix1[0].length;
        int rowb = matrix2.length;
        int colb = matrix2[0].length;

        int[][] result = new int[rowa][colb]; 

        if(cola == rowb){
            for(int i = 0; i < rowa; i++){
                for(int j = 0; j < colb; j++){
                    for(int k = 0; k < cola; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }

        for(int i = 0; i < rowa; i++){ 
            for(int j = 0; j < colb; j++){ 
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
