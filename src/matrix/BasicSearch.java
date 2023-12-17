package matrix;

public class BasicSearch {
    public static void main(String[] args) {
        int mat[][] = {
                {2, 7, 15},
                {4, 9, 19},
                {6, 10, 24}
        };


        int indexs[] = searchBruteForce(mat, 10);
        System.out.println(indexs);

        int indexs2[] = efficient(mat, 10);
        System.out.println(indexs2);

    }

    private static int[] searchBruteForce(int[][] mat, int ele) {
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                    if(mat[i][j] == ele){
                        return new int[]{i, j};
                    }
            }
        }
        return new int[]{};
    }


    ///               {2, 7, 15},
    //                {4, 9, 19},
    //                {6, 10, 24}
    private static int[] efficient(int[][] mat, int ele) {


        for(int r=0, c=mat[0].length-1; r < mat.length; )
        {
            System.out.println(mat[r][c]);
            if(mat[r][c] == ele){
                return new int[]{r,c};
            }
            if(ele > mat[r][c] ){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{};


        /*int rows = mat.length;
        int cols = mat[0].length;

        int r, c;
        r = 0;
        c = cols - 1;

        while(r < rows && c >= 0){
            if(mat[r][c] == ele){
                return new int[]{r, c};
            }

            if(ele < mat[r][c]){
                c--;
            }
            else {
                r++;
            }
        }
        return new int[]{};*/
    }

}
