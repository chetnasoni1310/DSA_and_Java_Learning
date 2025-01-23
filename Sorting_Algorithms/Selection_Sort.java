import java.util.Arrays;

public class Selection_Sort {
    public static void selection(int []arr)
    {   
        int n=arr.length;
        if(n<=1)
        {
            return;
        }
       for(int i = 0; i < arr.length; i++)
       {  
         int lastIndex=arr.length-1-i;
         int maxIndex= getMax(arr,0,lastIndex);
         swap(arr, lastIndex, maxIndex);
       }
    } 
    public static int getMax(int[] arr, int start,int end)
    {
        int max=start;
        for(int i = start; i <=end; i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[]arr={3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
