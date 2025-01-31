package Recursion.Subset_Subseq_String_Ques_;

    /*
             ***********************************************
             str.startsWith(toRemove)
             * ********************************************
             * *******************************************
             * *******************************************
     */

public class Skip_A_String {
    static String Skip_A_String_Iterative(String str,String toRemove)
    {
        return str.replaceAll(toRemove,"");
    }
    static void Skip_A_String_Iterative_II(String str,String toRemove)
    {
        String res=str.replaceAll(toRemove,"");
        System.out.println(res);
        return ;
    }
    static void Skip_A_String_Recursive(String str, StringBuilder result,String toRemove)
    {
        if(str.isEmpty())
        {
            System.out.println(result.toString());
            return ;
        }
        if (str.length() >= toRemove.length()) {
            String toCompare = str.substring(0, toRemove.length());
            if (toCompare.equals(toRemove)) {
                Skip_A_String_Recursive(str.substring(toRemove.length()), result, toRemove);
            }
            else{
                Skip_A_String_Recursive(str.substring(1),result.append(str.charAt(0)),toRemove);
            }
        }
        else{
            Skip_A_String_Recursive(str.substring(1),result.append(str.charAt(0)),toRemove);
        }
    }
    static String Skip_A_String_Recursive_II(String str,String toRemove)
    {
        if(str.isEmpty())
        {
            return "";
        }
        if (str.length() >= toRemove.length()) {
            String toCompare = str.substring(0, toRemove.length());
            if (toCompare.equals(toRemove)) {
                return Skip_A_String_Recursive_II(str.substring(toRemove.length()), toRemove);
            }
            else{
                return str.charAt(0)+ Skip_A_String_Recursive_II(str.substring(1),toRemove);
            }
        }
        else{
           return str.charAt(0)+ Skip_A_String_Recursive_II(str.substring(1),toRemove);
        }
    }

    public static void main(String[] args) {
        String str="abcdbcdafgf";
        String toRemove="bcd";

        String res = Skip_A_String_Iterative(str,toRemove);
        System.out.println(res);
        System.out.println();

         Skip_A_String_Iterative_II(str,toRemove);

        System.out.println();

        StringBuilder result=new StringBuilder("");
        Skip_A_String_Recursive(str,result,toRemove);

        System.out.println();

        String resIII = Skip_A_String_Recursive_II(str,toRemove);
        System.out.println();

    }
}
