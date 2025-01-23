import java.util.Arrays;

public class Bubble_Sort{
//space=O(1)
//Time= Best=o(n)
//      Worst=O(n@2)
    public static void BubbleSort(int[]arr)
    {
        int n=arr.length;
        if(n<=1)
        {
            return;
        }
       for(int i=0;i<n;i++)
       {  
        boolean isSwap=false;
        for(int j=1;j<n-i;j++)
        {
            if(arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                isSwap=true;
            }
        }
        if(!isSwap)
       {
        return;
       }
       }
       
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[]arr={3,1,5,4,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}