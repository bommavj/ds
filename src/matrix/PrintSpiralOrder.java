package matrix;

import java.util.ArrayList;
import java.util.List;

public class PrintSpiralOrder {

    public static void main(String[] args) {

        // row is fixed , col ++ (0,1 -> 0,2 -> 0,3)
        // col is fixed, row++ (2,
        // row is fixed, col--;
        // row is fixed, col++
        /*int mat[][] = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };*/

        int[][] mat =
                {
                        { 1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                };

        //row=0, col=0, col++;
        //col=2, row=1, row++;
        //row=2, col=2, col--;
        //row=1, col=0, col++;
        //printSpiralOrder(mat);

        //spiralOrder(mat);

        spiralOrder2(mat);
    }

    // top -> right -> bottom -> left
    private static void printSpiralOrder(int[][] mat) {

        if(mat == null || mat.length ==0)
            return;

        int top=0, bottom = mat.length-1;
        int left = 0, right = mat[0].length-1;

        while(true){

            if (left > right) {
                break;
            }

            // print top row
            for(int i=left; i<=right; i++){
                System.out.print(mat[top][i] + " "); // top -> left to right
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right
            for(int i=top; i<= bottom; i++){
                System.out.print(mat[i][right] + " "); // right -> top to bottom
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom
            for(int i=right-1; i>= left; i--){
                System.out.print(mat[bottom][i] + " "); // bottom -> right to left
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            //print left
            for(int i=bottom-1; i>= top; i--){
                System.out.print(mat[i][left] + " "); // bottom -> bottom to top
            }

            left++;
        }







        /*for(int row = 0, col=0; col < mat.length; ){
            System.out.print(mat[row][col++] + " ");
        }

        for(int row = 1, col=mat[0].length-1; row < mat.length; ){
            System.out.print(mat[row++][col] + " ");
        }

        for(int row = mat[0].length-1, col=mat[0].length-2; col >= 0; ){
            System.out.print(mat[row][col--] + " ");
        }

        for(int row = mat[0].length-2, col=0; col < mat[0].length-1; ){
            System.out.print(mat[row][col++] + " ");
        }*/
    }

    //  int[][] mat =
    //                {
    //                        { 1, 2, 3, 4, 5},
    //                        {16, 17, 18, 19, 6},
    //                        {15, 24, 25, 20, 7},
    //                        {14, 23, 22, 21, 8},
    //                        {13, 12, 11, 10, 9}
    //                };

    public static List<Integer> spiralOrder(int[][] matrix) {
        // Initialize the result array
        List<Integer> result = new ArrayList<>();
        // Check for empty matrix
        if (matrix.length == 0) {
            return result;
        }
        // Set up the variables to track the boundaries of the matrix
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        // Iterate through the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Traverse the top row from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            // Traverse the right column from top to bottom
            for (int i = top + 1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            // Traverse the bottom row from right to left
            if (top < bottom) {
                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            // Traverse the left column from bottom to top
            if (left < right) {
                for (int i = bottom - 1; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            // Update the boundaries of the matrix
            top++;
            bottom--;
            left++;
            right--;
        }
        return result;
    }

    private static List<Integer> spiralOrder2(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> sprialList = new ArrayList<>();
        while(top <= bottom && left <= right){

            // top row-> left to right
            for(int i=left; i<= right; i++){
                sprialList.add(matrix[top][i]);
            }

            // right column -> top to bottom
            for(int i=top+1; i<=bottom; i++){
                sprialList.add(matrix[i][right]);
            }

            if(top < bottom){
                //bottom row -> right to left
                for(int i=right - 1; i>=left; i--){
                    sprialList.add(matrix[bottom][i]);
                }
            }

            if(left < right){
                //left column -> bottom to top
                for(int i=bottom-1; i> top; i--){
                    sprialList.add(matrix[i][left]);
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        return sprialList;
    }
}
