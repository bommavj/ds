package matrix;

public class BasciMatrixNoOfIslands {

    public static void main(String[] args) {

        int[][] mat =
                {
                        { 0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 0},
                        {1, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                };

        int count = countIslands(mat);
        System.out.println(count);

       /* int[][] mat2 =
                {
                        { 1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1 }
                };
        setZeros(mat2);*/

        int[][] mat3 =
                {
                        {0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}
                };

        setZeros(mat3);
        System.out.println(mat3);
    }

    private static int countIslands(int[][] mat) {
        boolean visited[][] = new boolean[mat.length][mat[0].length];
        int count = 0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1 && !visited[i][j]){
                    dfs(mat, i , j , visited);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] mat, int i, int j, boolean[][] visited) {
        visited[i][j] = true;

        if(isSafe(mat, i-1, j-1, visited)){
            dfs(mat, i-1, j-1, visited);
        }

        if(isSafe(mat, i-1, j, visited)){
            dfs(mat, i-1, j, visited);
        }

        if(isSafe(mat, i-1, j+1, visited)){
            dfs(mat, i-1, j+1, visited);
        }

        if(isSafe(mat, i, j-1, visited)){
            dfs(mat, i, j-1, visited);
        }

        if(isSafe(mat, i, j+1, visited)){
            dfs(mat, i, j+1, visited);
        }

        if(isSafe(mat, i+1, j-1, visited)){
            dfs(mat, i+1, j-1, visited);
        }

        if(isSafe(mat, i+1, j, visited)){
            dfs(mat, i+1, j, visited);
        }

        if(isSafe(mat, i+1, j+1, visited)){
            dfs(mat, i+1, j+1, visited);
        }
    }

    private static boolean isSafe(int[][] mat, int i, int j, boolean[][] visited) {
        return i >=0 && i <mat.length &&
                j >=0 && j < mat[i].length &&
                mat[i][j] == 1 &&
                ! visited[i][j];
    }


    private static void setZeros(int[][] mat) {
        boolean visited[][] = new boolean[mat.length][mat[0].length];

        boolean col = false;
        for(int c=0; c<mat.length; c++){
            if(mat[0][c] == 0){
                col = true;
            }
        }

        boolean row = false;
        for(int r=0; r<mat[0].length; r++){
            if(mat[r][0] == 0){
                row = true;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0 && !visited[i][j]) {
                    mat[i - 1][j] = 0;
                    mat[i + 1][j] = 0;
                    mat[i][j - 1] = 0;
                    mat[i][j + 1] = 0;

                    visited[i - 1][j] = true;
                    visited[i + 1][j] = true;
                    visited[i][j - 1] = true;
                    visited[i][j + 1] = true;

                }
            }
        }
    }
}
