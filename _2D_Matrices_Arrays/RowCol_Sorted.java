package _2D_Matrices_Arrays;

import java.util.Arrays;

public class RowCol_Sorted {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,11,12,13},
                {14,23,24,25}
        };
        System.out.println(Arrays.toString(search(arr,25)));
    }
    static int[] search(int[][]matrix , int target)
    {
        int row= matrix.length;
        int col=matrix[0].length;
        int r=0;
        int c=col-1;
        while(r<row && c>=0)
        {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            else if(matrix[r][c] > target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        System.out.println("Does not Exist");
    return new int[]{-1,-1};
    }
}
