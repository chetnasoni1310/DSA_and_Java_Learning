package Recursion.Subset_Subseq_String_Ques_;

public class Skip_A_Char {
    static String Skip_A_Character_Iterative(String n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if (!(n.charAt(i)=='a') ){
                result.append(n.charAt(i));
            }
        }
        return result.toString();
    }
    static void Skip_A_Chr_Recursive(String str,String result)
    {
        if(str.isEmpty())
        {
            System.out.println(result);
            return ;
        }
        char ch=str.charAt(0);
        if(ch=='a')
        {
            Skip_A_Chr_Recursive(str.substring(1),result);
        }
        else {
            Skip_A_Chr_Recursive(str.substring(1), result + ch);
        }
    }
    static String Skip_A_Chr_Recursive_Part_II(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a')
        {
            return Skip_A_Chr_Recursive_Part_II(str.substring(1));
        }
        else
        {
            return ch+Skip_A_Chr_Recursive_Part_II(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str="asdfgasddaaaa";
        Skip_A_Chr_Recursive(str,"");

        System.out.println();

        String res=Skip_A_Character_Iterative(str);
        System.out.println(res);

        System.out.println();

        String resII=Skip_A_Chr_Recursive_Part_II(str);
        System.out.println(resII);
    }
}
