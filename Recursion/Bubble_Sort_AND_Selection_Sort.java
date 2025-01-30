package Recursion;

import java.util.Arrays;

public class Bubble_Sort_AND_Selection_Sort {


    public static void Bubble_Sort(int[]arr,int index_i,int index_j) {
        // Same as Pattern in Right Triangle
        if (index_i == 0) {
            return;
        }

        // Inner loop: Perform a single pass of bubble sort
        if (index_j < index_i) {
            if (arr[index_j] > arr[index_j + 1]) {
                swap(arr, index_j, index_j + 1);
            }
            Bubble_Sort(arr, index_i, index_j + 1);
        } else {
            Bubble_Sort(arr, index_i - 1, 0);
        }
    }
    public static void swap(int[]arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
   public static void Selection_Sort(int[]arr,int max,int i,int j)
   {
       if(i==0)
       {
           return;
       }
       if(i>j) {
           if (arr[j] > arr[max]) {
               max = j;
           }
               Selection_Sort(arr, max, i, j + 1);
       }
       else{
           swap(arr,max,i-1);
           Selection_Sort(arr,0,i-1,0);
       }
   }
    public static void main(String[] args) {
        int[]arr={2,4,5,74,3,6,9};
        int[]arr2={2,4,5,74,3,6,9};
        System.out.println(Arrays.toString(arr));
        Bubble_Sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        System.out.println(Arrays.toString(arr2));
        Selection_Sort(arr2,0,arr2.length,0);
        System.out.println(Arrays.toString(arr2));
    }
}
