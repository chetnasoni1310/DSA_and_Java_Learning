package Recursion.Subset_Subseq_String_Ques_;

import java.util.ArrayList;
import java.util.List;
//ASCII VALUE *************************************************
//Niche hai
public class Subsets_Ques {

    static List<String> subsets(String p,String up)
    {
         if(up.isEmpty())
         {
             List<String> list=new ArrayList<>();
             list.add(p);
             return list;
         }
         char ch=up.charAt(0);
         List<String> left=subsets(p+ch ,up.substring(1));
         List<String> right=subsets(p,up.substring(1));
         right.addAll(left);
         return right;
    }
    static void subsets_II(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsets_II(p+ch ,up.substring(1));
        subsets_II(p,up.substring(1));
    }
    static void subsets_III(String p,String up,List<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return ;
        }
        char ch=up.charAt(0);
        subsets_III(p+ch ,up.substring(1),list);
        subsets_III(p,up.substring(1),list);
    }

    //ASCII VALUE *************************************************
    static void subsets_IV(String p,String up,List<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return ;
        }
        char ch=up.charAt(0);
        subsets_IV(p+ch ,up.substring(1),list);
        subsets_IV(p,up.substring(1),list);
        subsets_IV(p+(ch-0),up.substring(1),list);
    }
    public static void main(String[] args) {
        List<String> listt=subsets("","abc");
        System.out.println(listt);

        System.out.println();

        subsets_II("","abc");

        System.out.println();

        List<String> result=new ArrayList<>();
        subsets_III("","aaa",result);
        System.out.println(result);

        System.out.println();

        char ch='a';
        System.out.println(ch-0);

        System.out.println();

        //ASCII VALUE *************************************************
        List<String> resultII=new ArrayList<>();
        subsets_IV("","abc",resultII);
        System.out.println(resultII);

    }
}
