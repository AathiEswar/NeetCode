package NeetCode;

import java.util.ArrayList;
import java.util.List;

public class TwoDShift {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rowLen = grid.length;
        int colLen = grid[0].length;

        int totalLen = rowLen * colLen;

        // convert 2d matric to 1d array
        int[] res = new int[totalLen];

        for(int i = 0; i< rowLen ;i++){
            for(int j = 0 ; j < colLen ; j++){
                int actualIndex = i*colLen + j;

                res[actualIndex] = grid[i][j];
            }
        }

        k = k % totalLen;

        reverseArray(res , 0 , totalLen-1);
        reverseArray(res , 0 , k-1);
        reverseArray(res , k , totalLen-1);

        // for(int i = 0; i< rowLen ;i++){
        //     for(int j = 0 ; j < colLen ; j++){
        //         System.out.print(res[i*colLen + j] + " ");
        //     }
        //     System.out.println();
        // }

        List<List<Integer>> resList = new ArrayList<>();

        for(int i = 0; i< rowLen ;i++){
            List<Integer> subList  = new ArrayList<>();
            for(int j = 0 ; j < colLen ; j++){
                subList.add( res[i*colLen + j]);
            }

            resList.add(subList);
        }
        return resList;
    }

    public void reverseArray(int[] grid , int start , int end){

        while(start < end){
            int temp = grid[start];
            grid[start] = grid[end];
            grid[end] = temp;
            start++;
            end--;
        }
    }
}
