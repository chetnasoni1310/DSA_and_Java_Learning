package Recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static int[] mergeSort(int[]arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right)
    {
      int[]ans=new int[left.length + right.length];
      int k=0;
      int i=0;
      int j=0;
      while(i< left.length && j<right.length)
      {
          if(left[i]<=right[j]) {
              ans[k] = left[i];
              i++;
          }
          else{
              ans[k]=right[j];
              j++;
          }
          k++;
      }
              while(i< left.length)
              {
                 ans[k++]=left[i++];

              }
        while(j< right.length)
        { ans[k++]=right[j++];

        }
        return ans;
    }
    public static void mergeSort_In_Place(int[]arr,int s,int e)
    {

        if(e-s==1)
        {
            return;
        }
        int mid=(e+s)/2;
        mergeSort_In_Place(arr,s,mid);
        mergeSort_In_Place(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr,int s,int m,int e)
    {
        int[]ans=new int[e-s];
        int k=0;
        int i=s;
        int j=m;
        while(i<m && j<e)
        {
            if(arr[i]<=arr[j]) {
                ans[k] = arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {

                ans[k++]=arr[i++];

        }
        while(j<e)
        {

                ans[k++]=arr[j++];

        }
        for (int l = 0; l < ans.length; l++) {
            arr[s + l] = ans[l];
        }

    }
    public static void main(String[] args) {
        int[]arr={12,5,9,6,2,81,23,4};
        System.out.println(Arrays.toString(arr));
        int[]ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));

        System.out.println();

        System.out.println(Arrays.toString(arr));
        mergeSort_In_Place(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
