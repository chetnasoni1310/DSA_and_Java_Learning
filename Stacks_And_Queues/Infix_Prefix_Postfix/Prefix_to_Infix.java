package Stacks_And_Queues.Infix_Prefix_Postfix;

import java.util.Stack;

public class Prefix_to_Infix {
    public static void main(String[] args) {
        Stack<String> infix=new Stack<>();
        String s="*+pq-mn";
        int len=s.length();
        for(int i=len-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                infix.push(Character.toString(ch));
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                String a=infix.pop();
                String b=infix.pop();
                String res='('+a+ch+b+')';
                infix.push(res);
            }
        }
        System.out.println(infix.pop());
    }
}
