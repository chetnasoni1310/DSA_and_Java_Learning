package _2D_Matrices_Arrays;

import java.util.Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
           int[][]arr={
                   {1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,45}
           };
        System.out.println(Arrays.toString(search(arr,43)));
    }
   static int[] searchBinary(int[][]matrix ,int row,int c_start,int c_end,int target)
   {
       while(c_start<=c_end)
       {
           int mid= c_start +(c_end-c_start)/2;
           if(matrix[row][mid]==target)
           {
               return new int[]{row,mid};
           }
           else if(matrix[row][mid]>target)
           {
               c_end=mid-1;
           }
           else{
               c_start=mid+1;
           }
       }
       return new int[]{-1,-1};
   }
    static int[] search(int[][]matrix ,int target)
    {
        int row=matrix.length;
        int col=matrix[0].length;


        //Testing is target is in matrix boundaries
        if (target < matrix[0][0] || target > matrix[row - 1][col - 1]) {
            return new int[]{-1, -1};
        }
        if(row==1)
        {
            return searchBinary(matrix,0,0,col-1,target);
        }
        int r_start=0;
        int r_end=row-1;
        int col_mid=col/2;

        while(r_start<(r_end-1)) //here when this is true we are having more than 2 rows
                               //think bcz last is end and
                            // last second is end-1 so when the start becomes end-1 we
            // have exactly 2 rows and when start is less
            // than end-1 we will have more than 2 rows
        {
            int mid=r_start +(r_end-r_start)/2;
            if(matrix[mid][col_mid]==target)
            {
                return new int[]{mid,col_mid};
            }
            else if(matrix[mid][col_mid]>target)
            {
             r_end=mid;
            }else {
                 r_start=mid;
            }
        }
        //Now we have 2 rows only
        //pehle check kro mid column mai hai ya nahi
                                 //    ****************DON'T FORGET 2 ROWS HAI **************************
        if(matrix[r_start][col_mid]==target)
        {
            return new int[]{r_start,col_mid};
        }
        if (matrix[r_start + 1][col_mid] == target) {
            return new int[]{r_start + 1, col_mid};
        }
        //1st half
        if(col_mid - 1 >= 0 && target>=matrix[r_start][0] &&matrix[r_start][col_mid-1]>=target)
        {
            return searchBinary(matrix,r_start,0,col_mid-1,target);
        }
        //2nd half
        if(col_mid + 1 < col && matrix[r_start][col_mid+1]<=target && target<=matrix[r_start][col-1])
        {
            return searchBinary(matrix,r_start,col_mid+1,col-1,target);

        }
        //3rd half
        if(col_mid - 1 >= 0 && target>=matrix[r_start+1][0] && matrix[r_start+1][col_mid-1]>=target)
        {
            return searchBinary(matrix,r_start+1,0,col_mid-1,target);

        }
        //4th half
        if (col_mid + 1 < col && target >= matrix[r_start + 1][col_mid + 1] && target <= matrix[r_start + 1][col - 1]) {
            return searchBinary(matrix, r_start + 1, col_mid + 1, col - 1, target);
        }
        return new int[]{-1, -1};
        //{-1,-1} wala funda binary search mai already included hai !!
    }
}
