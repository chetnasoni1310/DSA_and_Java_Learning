import java.util.Arrays;

public class Insertion_Sort{

public static void insertion(int[]arr)
{
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j-1, j);
                }
                else{
                    break;
                }
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
    insertion(arr);
    System.out.println(Arrays.toString(arr));
}
}