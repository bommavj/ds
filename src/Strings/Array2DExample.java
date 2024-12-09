package Strings;

import java.util.ArrayList;
import java.util.List;

public class Array2DExample {
    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.size();
        
        // create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        //
       int r = 0;
       int c = 0;
        int total = a.length * a[0].length;
        int ct = 0;
       while(ct < total){

           //row is incrementing, col remains same
           for(int i=r, j=c; i<a.length; i++){
               System.out.println(a[i][j]);
               ct++;
           }
           System.out.println( " ");

           //col is incrementing, row remains same
           //row should point to last index
           for(int i=a.length-1, j=c+1; j<a[0].length; j++){
                   System.out.println(a[i][j]);
               ct++;
           }
           System.out.println( " ");

           // row is decrementing, col is same
           // col should point to a[0].length -1
           for(int i=a.length-1, j=a[0].length-1; i>=0; i--){
               if(i != j) {
                   System.out.println(a[i][j]);
                   ct++;
               }
           }
           System.out.println( " ");

            //row is constant, col is decrementing
           for(int i=r, j=a.length-1-1; j>=0; j--){
               if(i != j) {
                   System.out.println(a[i][j]);
                   ct++;
               }
           }
           System.out.println( " ");

       }
    }
}