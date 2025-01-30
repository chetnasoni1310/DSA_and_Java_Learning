package Recursion.String_Ques_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_Ques_Iterative_Parts {

    public static List<List<Integer>> subsets(int[]arr)
    {
        int n=arr.length;
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>() );
        for(int i=0;i<n;i++) {
            int size_of_outer_list = outer.size();
            for (int j = 0; j < size_of_outer_list; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
return outer;
    }

    public static List<List<Integer>> subsets_II_Duplicate_elements(int[]arr)
    {
        int n=arr.length;
        int start=0;
        int end=0;
        //kaha se add krna start and stop krna hai iff duplicate elements founded

        Arrays.sort(arr);
        //Sort krlo taki duplicate elements sath m ho jaaye
//        vrna more complicated



        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>() );
        for(int i=0;i<n;i++) {
            int size_of_outer_list = outer.size();

             start=0;
//            but if duplicate elements found make it end+1
            if(i>0 && arr[i]==arr[i-1])
            {
                start=end+1;
            }
            end=size_of_outer_list -1 ;
            for (int j = start; j < size_of_outer_list; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3};
        List<List<Integer>> ans=subsets(arr);
        for(List i:ans)
        {
            System.out.println(i);
        }

        int[]arrI={1,2,2};
        List<List<Integer>> ans__=subsets_II_Duplicate_elements(arrI);
        for(List i:ans__)
        {
            System.out.println(i);
        }
    }
}
