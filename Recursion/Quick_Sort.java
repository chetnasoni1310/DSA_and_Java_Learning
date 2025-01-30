package Recursion;

import java.util.Arrays;

public class Quick_Sort {
    public static void quickSort(int[]arr , int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int s=low;
        int end=high;
        int mid=s+(end-s)/2;
        int pivot=arr[mid];

        while(s<=end)
        {
           while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[end]>pivot) {
                end--;
            }
            //This is the reason it is preferred over the merge sort
            //Because if it is already sorted it will end the loop right here and call other recursive calls
            if(s<=end)
            {
                swap(arr,s,end);
                s++;
                end--;
            }
        }
        //Now pivot is at its correct index call recursion for left and right parts of pivot
        quickSort(arr,low,end);
        quickSort(arr,s,high);
    }

    private static void swap(int[] arr, int s, int end) {
        int temp=arr[s];
        arr[s]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {
        int[]arr={12,3,5,6,6,4,2,2,455,654,98};
        System.out.println(Arrays.toString(arr));

        System.out.println();

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
