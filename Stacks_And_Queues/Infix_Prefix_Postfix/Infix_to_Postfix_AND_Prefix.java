package Stacks_And_Queues.Infix_Prefix_Postfix;

import java.util.Stack;

public class Infix_to_Postfix_AND_Prefix {
    public static void main(String[] args) {
        Stack<String> prefix=new Stack<>();
        Stack<String> postfix=new Stack<>();
        Stack<Character> operator=new Stack<>();
        String s="a*(b-c)/d+e";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                operator.push(ch);
            }else if( Character.isLetterOrDigit(ch) ){
                StringBuilder operand = new StringBuilder();
                while (i < s.length() && Character.isLetterOrDigit(s.charAt(i))) {
                    operand.append(s.charAt(i));
                    i++;
                }
                i--;
                prefix.push(operand.toString());
                postfix.push(operand.toString());
            }
            else if(ch==')')
            {
                while(!operator.isEmpty() && operator.peek()!='(')
                {
                    Process(operator,prefix,postfix);
                }
                if (!operator.isEmpty()) {
                    operator.pop();  // Pop '('
                }
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                while(!operator.isEmpty() && Precedence(ch) <= Precedence(operator.peek()))
                {
                    Process(operator,prefix,postfix);
                }
              operator.push(ch);
            }
        }
        //Agar kuch bacha hua ho toh
        while(!operator.isEmpty())
        {
             Process(operator,prefix,postfix);
        }
        System.out.println(prefix.peek());
        System.out.println(postfix.peek());

    }
    private static int Precedence(char ch)
    {
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        return -1;
    }
    private static void Process( Stack<Character> operator, Stack<String> prefix, Stack<String> postfix)
    {
        char ch=operator.pop();
        String v2=prefix.pop();
        String v1=prefix.pop();
        String a2=postfix.pop();
        String a1=postfix.pop();
        String res1=ch+v1+v2;
        String res2=a1+a2+ch;
        prefix.push(res1);
        postfix.push(res2);
    }
}
