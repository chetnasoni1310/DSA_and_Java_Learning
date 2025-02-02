package Stacks_And_Queues.Infix_Prefix_Postfix;

import java.util.Stack;

public class Prefix_to_Postfix {
    public static void main(String[] args) {


        Stack<String> postfix = new Stack<>();
        String s = "/-ab*+def";
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.push(Character.toString(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String a = postfix.pop();
                String b = postfix.pop();
                String res = a + b +ch;
                postfix.push(res);
            }
        }
        System.out.println(postfix.pop());
    }
}