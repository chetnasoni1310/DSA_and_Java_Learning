
    import java.util.Arrays;

    public class Merge_Sort {

public static void insertion(int[]arr)
{

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

