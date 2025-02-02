package Stacks_And_Queues.Infix_Prefix_Postfix;

import java.util.Stack;

public class Postfix_to_Prefix {
    public static void main(String[] args) {
        Stack<String> prefix=new Stack<>();
        String s="ab-de+f*/";
        int len=s.length();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                prefix.push(Character.toString(ch));
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                String a=prefix.pop();
                String b=prefix.pop();
                String res=ch+b+a;
                prefix.push(res);
            }
        }
        System.out.println(prefix.pop());
    }
}
