package matrix;

public class SetZeros {

    public static void main(String[] args) {
        int[][] mat =
                {
                        { 1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1 }
                };

        setZerosAnother(mat);

        int[][] mat2 =
        {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        setZeroes(mat2);
        System.out.println(mat2);
    }

    public static void setZerosAnother(int[][] mat){
        int top=0, bottom = mat.length-1;
        int left = 0, right = mat[0].length-1;
        while(true) {

            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                if(mat[top][i] == 0){
                    mat[top][i] = 0;
                }
            }
            top++;


        }

    }
    public static void setZeroes(int[][] matrix) {
        int row=-1, col = -1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0 && row != i && col != j){
                    dfs(matrix, i, j);
                    row = i;
                    col = j;
                }
            }
        }
    }

    private static void dfs(int[][] matrix, int i, int j){

        if(i > 0 && i < matrix.length) {
            matrix[i - 1][j] = 0;
            matrix[i + 1][j] = 0;
        }

        if(j > 0 && j < matrix.length) {
            matrix[i][j - 1] = 0;
            matrix[i][j + 1] = 0;
        }

       /* if(i<0 || i>= matrix.length && j<0 && j>= matrix[i].length && matrix[i][j] == 1){
            return;
        }

                matrix[i][j] = 0;
                dfs(matrix, i - 1, j);
                dfs(matrix, i + 1, j);
                dfs(matrix, i, j - 1);
                dfs(matrix, i, j + 1);*/

        // rows


        //cols
    }
}
