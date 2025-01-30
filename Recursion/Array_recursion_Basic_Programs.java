package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Array_recursion_Basic_Programs {
    public static boolean isSorted_Array(int[]arr,int i)
    {
        if(i==arr.length-1 || arr.length<=1)
        {
            return true;
        }
       if(i==arr.length-2 || arr.length==2)
       {
           return arr[i]<=arr[i+1];
       }
      return  arr[i]<=arr[i+1] && isSorted_Array(arr,i+1);
    }
    public static int Linear_Search(int[]arr,int target,int i)
    {
        if(i==arr.length-1 || arr.length<=1)
        {
            if(arr[i]==target)
            return i;
            else return -1;
        }
        return arr[i]==target ? i : Linear_Search(arr,target,i+1);
    }

   static List<Integer> list=new ArrayList<>();
    public static List<Integer> Linear_Search_All_Occurences_Of_Target(int[]arr, int target, int i)
    {
        if(i==arr.length-1 || arr.length<=1)
        {
            if(arr[i]==target) {
                list.add(i);
            }
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        return Linear_Search_All_Occurences_Of_Target(arr,target,i+1);
    }
    public static List<Integer> Linear_Search_All_Occurences_Of_Target_Creating_List_In_Function(int[]arr, int target, int i)
    {
        List<Integer> list =new ArrayList<>();
        if(i==arr.length )
        {
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        List<Integer> Elements_From_Below_Calls=Linear_Search_All_Occurences_Of_Target_Creating_List_In_Function(arr,target,i+1);
        list.addAll(Elements_From_Below_Calls);
        return list;
    }
    public static int Rotated_Binary_Search_Iterative(int[]arr,int target)
    {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            else if(arr[start]<=arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static int Rotated_Binary_Search_Recursive(int[]arr,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[start]<=arr[mid])
        {
            if(target>=arr[start] && target<arr[mid])
            {
                return Rotated_Binary_Search_Recursive(arr,target,start,mid-1);
            }
            else {
                return Rotated_Binary_Search_Recursive(arr,target,mid+1,end);
            }
        }
        else{
            if(arr[mid]<target && target<=arr[end])
            {
                return Rotated_Binary_Search_Recursive(arr,target,mid+1,end);
            }
            else
            {
                return Rotated_Binary_Search_Recursive(arr,target,start,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={3,4,5,6,19};
        System.out.println(isSorted_Array(arr,0));
        System.out.println(Linear_Search(arr,3,0));

        int[]arr2={3,4,5,6,19,3,3};
        System.out.println(Linear_Search_All_Occurences_Of_Target(arr2,3,0));
        System.out.println(Linear_Search_All_Occurences_Of_Target_Creating_List_In_Function(arr2,3,0));


        int[]arr3={5,6,7,1,2,3,4};
        System.out.println(Rotated_Binary_Search_Iterative(arr3,6));
        System.out.println(Rotated_Binary_Search_Recursive(arr3,6,0,arr3.length-1));

    }
}
