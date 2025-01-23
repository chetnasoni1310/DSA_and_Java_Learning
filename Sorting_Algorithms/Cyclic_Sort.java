import java.util.Arrays;

public class Cyclic_Sort {
    
    
public static void cyclicFor_1_to_N(int[]arr)
{
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=n && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }


        
public static void cyclic_Generalized(int[]arr ,  int starting_of_range)
{
        int n=arr.length;
        int i=0;
        while(i<n){
            int correct=arr[i]-starting_of_range;
            if(arr[i]>=starting_of_range && correct<n && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
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
    cyclicFor_1_to_N(arr);
    System.out.println(Arrays.toString(arr));

    int[]arr2={7,9,6,5,8};
    cyclic_Generalized(arr2,5);
    System.out.println(Arrays.toString(arr2));
}
}
