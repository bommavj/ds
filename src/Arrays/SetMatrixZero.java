package Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
       int mat[][] = new int[][]{ {1,1,1}, {1,0,1}, {1,1,1} };
        //setZeroesBetter(mat);
        System.out.println(mat);
        setZeroesOptimal(mat);
    }

    private static void setZeroesOptimal(int[][] arr) {

        int n = arr.length, m = arr[0].length;

        int C0 = 1;

        // Traverse the arr and
        // mark 1st row & 1st
        // col as follows:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {

                    // mark i-th row:
                    arr[i][0] = 0;

                    // mark j-th column:
                    if (j == 0)
                        C0 = 0;
                    else
                        arr[0][j] = 0;
                }
            }
        }

        // Mark with 0 from (1,1)
        // to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] != 0) {

                    // Check for col & row:
                    if (arr[i][0] == 0 || arr[0][j] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        // Finally mark the
        // 1st row then 1st col:
        if (arr[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }
        if (C0 == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void setZeroesBetter(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                if(row[i] == -1 || col[j]== -1){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
