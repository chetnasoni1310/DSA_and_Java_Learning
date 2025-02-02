package Stacks_And_Queues.Infix_Prefix_Postfix;

import java.util.Stack;

public class Postfix_to_Infix {
    public static void main(String[] args) {
        Stack<String> infix=new Stack<>();
        String s="ab-de+f*/";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
//                StringBuilder operand=new StringBuilder();
//                while(i<s.length() && Character.isLetterOrDigit(s.charAt(i)))
//                {
//                    operand.append(s.charAt(i));
//                    i++;
//                }
//                i--;
//                infix.push(operand.toString());
//                Infix mai toh sath mai rhenge hi ab
                infix.push(Character.toString(ch));
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                String s2=infix.pop();
                String s1=infix.pop();
                String res= '('+s1+ch+s2+')';
                infix.push(res);
            }
        }
        System.out.println(infix.pop());
    }
}
