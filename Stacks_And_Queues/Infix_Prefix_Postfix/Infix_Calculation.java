package Stacks_And_Queues.Infix_Prefix_Postfix;

import java.util.Stack;

public class Infix_Calculation {
    public static void main(String[] args) {

        /**                             UNARY MINUS ######################## nai aata abhi toh but i will learn it
         * operands ko uske stack mai
         * operators ko unke stack mai
         * fir agar stack mai mujhse badi priority ka operator pada hai toh pehle voh solve hoga
         * i.e. pop krwa denge
         * fir operands mai se 2 pop krwayenge aur unpe operationn perform krwayenge
         */
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
        String exp="2+(5-3*6/2)";
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(ch=='(')
            {
                operator.push(ch);
            }else if(Character.isDigit(ch))
            {
//                operand.push(ch-'0');  <-- this will not work always in case of 2 digit numbers
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                i--;
                operand.push(num);
            }else if(ch==')')
            {
                 while(!operator.isEmpty() && operator.peek() !='(')
                 {
                     char op=operator.pop();
                     int a=operand.pop();
                     int b=operand.pop();
                     int res=operation(b,a,op);
                     operand.push(res);
                 }
                if (!operator.isEmpty()) {
                    operator.pop();  // Pop '('
                }
            }else if(ch=='+' || ch=='/' || ch=='*' || ch=='-') {
                int Precedence1 = Precedence(ch);
                while (!operator.isEmpty()  && Precedence1 <= Precedence(operator.peek())) {
                    char op = operator.pop();
                    int a = operand.pop();
                    int b = operand.pop();
                    int res = operation(b,a, op);
                    operand.push(res);
                }
                operator.push(ch);
            }
        }
        //Agar kuch bacha hua ho toh
        while(!operator.isEmpty())
        {
            char op = operator.pop();
            int a = operand.pop();
            int b = operand.pop();
            int res = operation(b,a, op);
            operand.push(res);
        }
        System.out.println(operand.peek());
    }
    static int Precedence(char operator)
    {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return -1;
        }
    }

    static int operation(int a,int b,char operator)
    {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}
